package desafioDIO.padroesprojeto.estrutural.decorator;

// Decorator abstrato
public abstract class NotificadorDecorator implements Notificador {
    protected final Notificador notificadorDecorado;

    public NotificadorDecorator(Notificador notificador) {
        this.notificadorDecorado = notificador;
    }

    @Override
    public void enviar(String mensagem) {
        notificadorDecorado.enviar(mensagem);
    }
}
