package classes;

public class Usuario extends Pessoa{
	private String senha;

	public Usuario(String nome, int idade) {
		super(nome, idade);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void criarEmail(String email1) {
		setEmail(email1);
	}

	@Override
	public String toString() {
		return "Usuario: "+super.getNome()+", idade: "+super.getIdade()+" email: "+super.getEmail()+" senha: "+getSenha();
	}
}