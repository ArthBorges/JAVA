package classes;

public class Poligono {
	private String nome;
	private int numLados;
	public Poligono(String nome, int numLados) {
		super();
		this.nome = nome;
		this.numLados = numLados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}	
}