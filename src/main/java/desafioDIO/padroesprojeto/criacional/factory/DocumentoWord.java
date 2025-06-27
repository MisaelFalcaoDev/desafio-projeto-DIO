package desafioDIO.padroesprojeto.criacional.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("word")
public class DocumentoWord implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abrindo documento Word");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando documento Word");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando documento Word");
    }
}
