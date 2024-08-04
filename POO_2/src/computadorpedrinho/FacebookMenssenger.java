package computadorpedrinho;

public class FacebookMenssenger extends ServicoMensagensInstantanea {
		
	@Override
	public void enviarMensagem() {
		valiadarConectadoInternet();
		
		System.out.println("Enviar Mensagem Facebook");
	}
	
	@Override
	public void receberMensagem() {
	
		System.out.println("Receber Mensagem Facebbok");
	}
	
	@Override
	protected void valiadarConectadoInternet() {
		// TODO Auto-generated method stub
		super.valiadarConectadoInternet();
	}
}
