package desafioDIO.padroesprojeto.criacional.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Fábrica
@Service
public class DocumentoFactory {
    private final Map<String, Documento> documentos;

    public DocumentoFactory(List<Documento> documentoBeans) {
        documentos = documentoBeans.stream()
                .collect(Collectors.toMap(
                        bean -> bean.getClass().getAnnotation(Qualifier.class).value(),
                        Function.identity()
                ));
    }

    public Documento criarDocumento(String tipo) {
        return documentos.get(tipo);
    }
}
