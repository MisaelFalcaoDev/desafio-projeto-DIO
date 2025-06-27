package desafioDIO.padroesprojeto.estrutural.proxy;

// Implementação real
public class ServicoDemoradoImpl implements ServicoDemorado {
    @Override
    public void operacaoDemorada() {
        System.out.println("Executando operação demorada...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void operacaoRapida() {
        System.out.println("Executando operação rápida");
    }
}
