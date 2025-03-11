package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orcamento implements Compra{
	Scanner ler = new Scanner(System.in);
	private List<Livro> pedido;

	public Orcamento() {
		super();
		this.pedido = new ArrayList<>();
	}
	
	void adicionarLivro(Livro livro) {
		//Adiciona livros ao orçamento
        pedido.add(livro);
    }
	
	public double calcularPreco() {
		//Percorre a lista de pedidos e calcula o preço total do orçamento
		double valor = 0;
		for (Livro livro : pedido) {
			valor += livro.getPreco();
		}
		return valor;
	}
	
	void listarPedidos() {
		//Lista todos os livros do pedido e imprime o valor total do pedido
		System.out.println("\n\t\tORÇAMENTO");
		System.out.println("_________________________________________________________________\n");
		for (Livro livro : pedido) {
			System.out.println("\tTítulo: " + livro.titulo + " | Valor: " + livro.getPreco() + " R$");
		}
		System.out.println("\n\t\tVALOR TOTAL: " + calcularPreco() + " R$");
		System.out.println("_________________________________________________________________");
	}

}
