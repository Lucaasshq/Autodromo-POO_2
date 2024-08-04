package apps;

public class MSNMenssenger extends ServicoMensagensInstantanea{
	@Override
	public void enviarMensagem() {
		valiadarConectadoInternet();
		
		System.out.println("Enviar Mensagem MSN");
		
		salvarHistoricoMensagem();
	}
	
	@Override
	public void receberMensagem() {
		
		System.out.println("Receber Mensagem MSN");
	}
	
	@Override
	protected void valiadarConectadoInternet() {
		// TODO Auto-generated method stub
		super.valiadarConectadoInternet();
	}

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de mensagem MSN");
		
	}
	
}
