package computadorpedrinho;

public class Telegram extends ServicoMensagensInstantanea{
	
	@Override
	public void enviarMensagem() {
		super.enviarMensagem();
		System.out.println("Enviar Mensagem Telegram");
	}
	
	@Override
	public void receberMensagem() {
		super.receberMensagem();
		System.out.println("Receber Mensagem Telegram");
	}
}
