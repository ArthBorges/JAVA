package classes;

public class Papagaio implements Animal{
	private String nome;
    private int nPatas;
	public Papagaio(String nome, int nPatas) {
		super();
		this.nome = nome;
		this.nPatas = nPatas;
	}
	public String fazerBarulho() {
        return "loro";
    }

    public int numeroDePatas() {
        return nPatas;
    }

    public String toString() {
        return "O papagaio " + nome + " com " + numeroDePatas() + " patas fez " + fazerBarulho();
    }
}
