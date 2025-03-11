package classes;

public class LivroFisico extends Livro {
	private double preco;

	public LivroFisico(String titulo, String isbn, double preco) {
		super(titulo, isbn);
		this.preco = preco;
	}
	
	protected double getPreco() {
		return preco;
	}

	@Override
	public int compareTo(Livro o) {
		return this.titulo.compareTo((o).titulo);
	}

	@Override
	public String toString() {
		return "Livro: " + titulo + ", ISBN: " + isbn + ", Preço: " + preco + ", Autor(es): " + autores;
	}
	
}
