package apps;

public abstract class ServicoMensagensInstantanea {
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	public abstract void salvarHistoricoMensagem();
	
	protected void valiadarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	
	
	
}
