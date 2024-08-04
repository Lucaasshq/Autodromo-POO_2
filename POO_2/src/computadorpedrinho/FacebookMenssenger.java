package computadorpedrinho;

public class FacebookMenssenger extends ServicoMensagensInstantanea {
		
	@Override
	public void enviarMensagem() {
		super.enviarMensagem();
		System.out.println("Enviar Mensagem Facebook");
	}
	
	@Override
	public void receberMensagem() {
		super.receberMensagem();
		System.out.println("Receber Mensagem Facebbok");
	}
}
