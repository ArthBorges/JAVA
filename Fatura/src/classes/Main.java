package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String descricao = ler.nextLine();
		int qtde = ler.nextInt();
		double preco = ler.nextDouble();
		Fatura fat1 = new Fatura(descricao, qtde, preco);
		System.out.println(fat1);
		ler.close();
	}

}

class Fatura{
	private String descricao;
	private int qtde;
	private double preco;
	public Fatura() {
		super();
	}
	public Fatura(String descricao, int qtde, double preco) {
		super();
		this.descricao = descricao;
		this.qtde = qtde;
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPrecoTotal() {
		return getQtde()*getPreco();
	}
	@Override
	public String toString() {
		return String.format("%d %s a R$ %.1f = R$ %.1f", qtde, descricao, preco, getPrecoTotal());
	}
}
