
public class Carro extends Veiculo {

	

	public	void ligar() {
		conferindoCambio();
		conferirCombustivel();
	System.out.println("Carro Ligando...");
	}
	
	private void conferirCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	
	private void conferindoCambio() {
		System.out.println("Conferindo cambio em P");
	}
	
}
