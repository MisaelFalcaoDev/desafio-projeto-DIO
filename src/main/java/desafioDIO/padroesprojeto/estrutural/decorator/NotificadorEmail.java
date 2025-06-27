package desafioDIO.padroesprojeto.estrutural.decorator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Componente concreto
@Service
@Primary
public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
