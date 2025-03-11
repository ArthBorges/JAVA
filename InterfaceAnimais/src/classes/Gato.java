package classes;

public class Gato implements Animal{
	private String nome;
    private int nPatas;
	public Gato(String nome, int nPatas) {
		super();
		this.nome = nome;
		this.nPatas = nPatas;
	}
	public String fazerBarulho() {
        return "miau";
    }

    public int numeroDePatas() {
        return nPatas;
    }

    public String toString() {
        return "O gato " + nome + " com " + numeroDePatas() + " patas fez " + fazerBarulho();
    }
}
