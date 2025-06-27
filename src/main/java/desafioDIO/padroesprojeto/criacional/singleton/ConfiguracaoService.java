package desafioDIO.padroesprojeto.criacional.singleton;

import org.springframework.stereotype.Service;

// Singleton com Spring
@Service
public class ConfiguracaoService {
    private String configuracao = "Padrão";

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}
