package livraria;

public class Autor {
	public String nome;
	public String email;
	public Autor() {
		super();
	}
	public Autor(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Autor [" + nome + ", email=" + email + "]";
	}
}