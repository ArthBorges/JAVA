package classes;

public class Moto extends Veiculo{
	private double tamCorrente;

	public Moto(String marca, String modelo, String cor, double tamCorrente) {
		super(marca, modelo, cor);
		this.tamCorrente = tamCorrente;
	}

	public double getTamCorrente() {
		return tamCorrente;
	}

	public void setTamCorrente(double tamCorrente) {
		this.tamCorrente = tamCorrente;
	}

	@Override
	public String toString() {
		return "Moto "+super.getMarca()+": "+super.getModelo()+" "+super.getCor()+" tamCorrente "+getTamCorrente();
	}
	
}
