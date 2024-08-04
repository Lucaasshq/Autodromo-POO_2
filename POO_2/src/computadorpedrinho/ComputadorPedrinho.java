package computadorpedrinho;

import apps.FacebookMenssenger;
import apps.MSNMenssenger;
import apps.ServicoMensagensInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		
		ServicoMensagensInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn")) {
		     smi = new MSNMenssenger();
		} else if (appEscolhido.equals("tlg")) {
			 smi = new Telegram();
		} else if (appEscolhido.equals("fbm")) {
			 smi = new FacebookMenssenger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		
		
		
	}

}
