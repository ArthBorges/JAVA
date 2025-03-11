package classes;

public class Quadrado extends Poligono{
	private double lado;
	public Quadrado(String nome, int numLados, double lado) {
		super(nome, numLados);
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		return getLado() * getLado();
	}
	@Override
	public String toString() {
		return super.getNome()+" tem "+super.getNumLados()+" lados e área= " +calcularArea();
	}
}