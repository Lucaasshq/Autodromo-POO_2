package computadorpedrinho;

public class Telegram extends ServicoMensagensInstantanea{
	
	@Override
	public void enviarMensagem() {
		valiadarConectadoInternet();
		System.out.println("Enviar Mensagem Telegram");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Receber Mensagem Telegram");
	}
	
	@Override
	protected void valiadarConectadoInternet() {
		// TODO Auto-generated method stub
		super.valiadarConectadoInternet();
	}
}
