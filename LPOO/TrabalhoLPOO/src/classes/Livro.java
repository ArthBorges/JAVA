package classes;

import java.util.ArrayList;

public abstract class Livro implements Comparable<Livro>{
	protected String titulo;
	protected String isbn;
	protected ArrayList<Autor> autores;
	
	public Livro(String titulo, String isbn) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = new ArrayList<>();
	}
	
	 void adicionarAutor(Autor autor) {
		 //adiciona autores ao arraylist autores
		 autores.add(autor);
	 }
	 abstract double getPreco();
}