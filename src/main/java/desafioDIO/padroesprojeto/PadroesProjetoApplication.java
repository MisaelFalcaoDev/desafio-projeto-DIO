package desafioDIO.padroesprojeto;

import desafioDIO.padroesprojeto.criacional.factory.DocumentoFactory;
import desafioDIO.padroesprojeto.criacional.factory.Documento;
import desafioDIO.padroesprojeto.criacional.singleton.ConfiguracaoService;
import desafioDIO.padroesprojeto.estrutural.decorator.Notificador;
import desafioDIO.padroesprojeto.estrutural.proxy.ServicoDemorado;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PadroesProjetoApplication implements CommandLineRunner {

	private final DocumentoFactory documentoFactory;
	private final ConfiguracaoService configuracaoService;
	private final Notificador notificador;
	private final ServicoDemorado servicoDemorado;


	public PadroesProjetoApplication(
			DocumentoFactory documentoFactory,
			ConfiguracaoService configuracaoService,
			Notificador notificador,
			ServicoDemorado servicoDemorado) {
		this.documentoFactory = documentoFactory;
		this.configuracaoService = configuracaoService;
		this.notificador = notificador;
		this.servicoDemorado = servicoDemorado;
	}

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n=== DEMONSTRAÇÃO PADRÕES CRIACIONAIS E ESTRUTURAIS ===\n");

		demonstrarPadroesCriacionais();
		demonstrarPadroesEstruturais();
	}

	private void demonstrarPadroesCriacionais() {
		System.out.println("\n--- PADRÕES CRIACIONAIS ---");

		// Singleton
		System.out.println("[Singleton] Configuração inicial: " + configuracaoService.getConfiguracao());
		configuracaoService.setConfiguracao("Config modificada via Singleton");
		System.out.println("[Singleton] Configuração atual: " + configuracaoService.getConfiguracao());

		// Factory Method
		System.out.println("\n[Factory Method] Criando documentos:");
		Documento pdf = documentoFactory.criarDocumento("pdf");
		pdf.abrir();
		pdf.salvar();

		Documento word = documentoFactory.criarDocumento("word");
		word.abrir();
		word.fechar();
	}

	private void demonstrarPadroesEstruturais() {
		System.out.println("\n--- PADRÕES ESTRUTURAIS ---");

		// Decorator
		System.out.println("[Decorator] Envio de notificação:");
		notificador.enviar("Mensagem importante decorada");

		// Proxy
		System.out.println("\n[Proxy] Testando serviço:");
		System.out.println("Primeira chamada - operação demorada:");
		servicoDemorado.operacaoDemorada();

		System.out.println("Segunda chamada - deve usar cache:");
		servicoDemorado.operacaoDemorada();

		System.out.println("Operação rápida:");
		servicoDemorado.operacaoRapida();
	}
}
