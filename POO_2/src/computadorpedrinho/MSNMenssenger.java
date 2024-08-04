package computadorpedrinho;

public class MSNMenssenger extends ServicoMensagensInstantanea{
	@Override
	public void enviarMensagem() {
		
		System.out.println("Enviar Mensagem MSN");
	}
	
	@Override
	public void receberMensagem() {
		
		System.out.println("Receber Mensagem MSN");
	}
	
}
