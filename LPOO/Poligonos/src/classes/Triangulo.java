package classes;

public class Triangulo extends Poligono{
	private double base;
	private double altura;
	public Triangulo(String nome, int numLados, double base, double altura) {
		super(nome, numLados);
		this.base = base;
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calcularArea() {
		return (getBase() * getAltura()) / 2;
	}
	@Override
	public String toString() {
		return super.getNome()+" tem "+super.getNumLados()+" lados e área= " +calcularArea();
	}
}