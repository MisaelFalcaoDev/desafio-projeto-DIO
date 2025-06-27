package desafioDIO.padroesprojeto.estrutural.proxy;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

// Proxy
@Service
public class ServicoDemoradoProxy implements ServicoDemorado {
    private final ServicoDemorado servicoReal = new ServicoDemoradoImpl(); // Criação direta
    private Instant ultimaChamada;

    @Override
    public void operacaoDemorada() {
        if (ultimaChamada != null && Duration.between(ultimaChamada, Instant.now()).toSeconds() < 5) {
            System.out.println("Cache: Operação demorada já foi executada recentemente");
            return;
        }
        servicoReal.operacaoDemorada();
        ultimaChamada = Instant.now();
    }

    @Override
    public void operacaoRapida() {
        servicoReal.operacaoRapida();
    }
}
