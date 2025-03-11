package livraria;

public class Livro {
	public static final String EDITORA = "ArtComics";
	private String titulo;
	private Autor autor;
	private int paginas;
	public Livro() {
		super();
	}
	public Livro(String titulo, Autor autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	/*public static String getEDITORA() {
		return EDITORA;
	}
	public static void setEDITORA(String eDITORA) {
		EDITORA = eDITORA;
	}*/
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Livro ["+ titulo + ", "+ autor + ", editora " + EDITORA + ", " +paginas+ " páginas ]";
	}
}