package apps;

public class FacebookMenssenger extends ServicoMensagensInstantanea {
		
	@Override
	public void enviarMensagem() {
		valiadarConectadoInternet();
		
		System.out.println("Enviar Mensagem Facebook");
		
		salvarHistoricoMensagem();
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

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de mensagem Facebook");
	}
}
