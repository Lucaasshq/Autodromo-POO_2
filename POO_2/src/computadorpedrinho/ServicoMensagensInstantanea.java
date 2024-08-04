package computadorpedrinho;

public abstract class ServicoMensagensInstantanea {
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	protected void valiadarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	
}
