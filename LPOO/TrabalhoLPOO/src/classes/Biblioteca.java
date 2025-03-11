package classes;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
	private ArrayList<Livro> livros; 
	private ArrayList<Livro> emprestados;
	
	public Biblioteca() {
		super();
		this.livros = new ArrayList<>();
		this.emprestados = new ArrayList<>();
	}
	
	void adicionarLivro(Livro livro){
		//Adiciona livros ao ArrayList livros
		livros.add(livro);
	}
	
	void emprestarLivro(Livro livro){
		/*Se o livro a ser emprestado existe no ArrayList livros e o livro ainda não foi adicionado
		ao ArrayList emprestados, então ele é colocado no ArrayList emprestados. Juntamente com a 
		retirada dele da disponibilidade na biblioteca.*/
		if (livros.contains(livro) && !emprestados.contains(livro)) {
			emprestados.add(livro);
			livros.remove(livro);
		}
	}
	void devolverLivro(Livro livro){
		/*Se o livro a ser devolvido existe no ArrayList emprestados, então ele é removido do ArrayList emprestados
		e adicionado novamente na biblioteca*/
		emprestados.remove(livro);
		livros.add(livro);
	}
	
	void imprimirLivros() {
		//imprime todos os livros em ordem alfabética por título existentes na Biblioteca		
		Collections.sort(livros);
		
		System.out.println("\n\t\tLivros na Biblioteca");
		System.out.println("_________________________________________________________________\n");
		for (Livro livro : livros) {
			System.out.println("\tTítulo: " + livro.titulo + "\n\tISBN: " + livro.isbn + "\n\tPreço: " + livro.getPreco()+ " R$" + "\n\tAutor(a): " + livro.autores);
			System.out.println();
		}
	}
	
	void imprimirEmprestados() {
		Collections.sort(emprestados);

		System.out.println("\n\t\tLivros Emprestados");
		System.out.println("_________________________________________________________________\n");
		for (Livro livro : emprestados) {
			System.out.println("\tTítulo: " + livro.titulo + "\n\tISBN: " + livro.isbn + "\n\tPreço: " + livro.getPreco()+ " R$" + "\n\tAutor(a): " + livro.autores);
			System.out.println();
		}
		
	}
	
}
