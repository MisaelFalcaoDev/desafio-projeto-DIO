package desafioDIO.padroesprojeto.estrutural.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Decorator concreto
@Service
public class NotificadorComCriptografia extends NotificadorDecorator {
    public NotificadorComCriptografia(@Qualifier("notificadorEmail") Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensagem) {
        String mensagemCriptografada = criptografar(mensagem);
        super.enviar(mensagemCriptografada);
    }

    private String criptografar(String mensagem) {
        return "CRIPTOGRAFADO(" + mensagem + ")";
    }
}
