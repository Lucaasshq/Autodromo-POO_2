package computadorpedrinho;

public class FacebookMenssenger extends ServicoMensagensInstantanea {
		
	@Override
	public void enviarMensagem() {
		
		System.out.println("Enviar Mensagem Facebook");
	}
	
	@Override
	public void receberMensagem() {
	
		System.out.println("Receber Mensagem Facebbok");
	}
}
