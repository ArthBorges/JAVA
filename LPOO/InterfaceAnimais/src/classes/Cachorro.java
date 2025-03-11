package classes;

public class Cachorro implements Animal{
	private String nome;
    private int nPatas;
	public Cachorro(String nome, int nPatas) {
		super();
		this.nome = nome;
		this.nPatas = nPatas;
	}
	public String fazerBarulho() {
        return "auau";
    }

    public int numeroDePatas() {
        return nPatas;
    }

    public String toString() {
        return "O cachorro " + nome + " com " + numeroDePatas() + " patas fez " + fazerBarulho();
    }
     
}
