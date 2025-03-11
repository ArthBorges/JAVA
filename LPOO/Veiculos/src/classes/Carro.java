package classes;

public class Carro extends Veiculo{
	private int numPortas;

	public Carro(String marca, String modelo, String cor, int numPortas) {
		super(marca, modelo, cor);
		this.numPortas = numPortas;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public void acelerar() {
		System.out.println("O "+super.toString()+" acelerou");
	}
	public void frear() {
		System.out.println("O "+super.toString()+" freou");
	}

	@Override
	public String toString() {
		return "Carro "+super.getMarca()+": "+super.getModelo()+" "+super.getCor()+" numPortas="+getNumPortas();
	}
	
}
