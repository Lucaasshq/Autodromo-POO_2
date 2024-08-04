package computadorpedrinho;

public class MSNMenssenger {
	public void enviarMensagem() {
		validarConectadoInternet();
		
		System.out.println("Enviar mensagem");
		
		salvarHistoricoMensagem();
	}
	
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	// Esses tipos de metodos mais tecnicos não precisam estar na classe principal do usuario
	private void validarConectadoInternet() {
		System.out.println("Validando se esta concetado a internet");
	}
	
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico da mensagem");
	}
	
}
