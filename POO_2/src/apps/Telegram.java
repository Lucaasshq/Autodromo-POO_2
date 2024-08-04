package apps;

public class Telegram extends ServicoMensagensInstantanea{
	
	@Override
	public void enviarMensagem() {
		valiadarConectadoInternet();
		System.out.println("Enviar Mensagem Telegram");
		
		salvarHistoricoMensagem();
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

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de mesagem Telegram");
		
	}
}
