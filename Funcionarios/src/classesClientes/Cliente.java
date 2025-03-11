package classesClientes;

public class Cliente extends Pessoa{
	private int pontuacao;

	public Cliente(String nome, String telefone) {
		super(nome, telefone);
	}
	public Cliente(String nome, String telefone, int pontuacao) {
		super(nome, telefone);
		this.pontuacao = pontuacao;
	}
	@Override
	public String toString() {
		return "Cliente:" + super.getNome() + ", celular=" +super.getTelefone()+ ",pontuacao=" + pontuacao;
	}
	
}
