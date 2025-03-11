package classesClientes;

public class Funcionario extends Pessoa{
	private double salario;

	public Funcionario(String nome, String telefone, double salario) {
		super(nome, telefone);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionário:"+ super.getNome() +", celular="+ super.getTelefone() + ",salario=" + salario;
	}
	
}
