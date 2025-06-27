package desafioDIO.padroesprojeto.criacional.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Implementações concretas
@Component
@Qualifier("pdf")
public class DocumentoPDF implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abrindo documento PDF");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando documento PDF");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando documento PDF");
    }
}
