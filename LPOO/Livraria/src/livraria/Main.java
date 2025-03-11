package livraria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, email;
		nome = ler.nextLine();
		email = ler.nextLine();
		Autor autor1 = new Autor();
		//Autor autor2 = new Autor(nome, email);
		//System.out.println(autor1);
		//System.out.println(autor2);
		autor1.nome = nome;
		autor1.email = email;
		System.out.println(autor1);
		
		String titulo = ler.nextLine();
		int paginas = ler.nextInt();
		Livro livro1 = new Livro();
		//Livro livro2 = new Livro(titulo, autor1, paginas);
		//System.out.println(livro1);
		//System.out.println(livro2);
		livro1.setTitulo(titulo);
		livro1.setAutor(autor1);
		livro1.setPaginas(paginas);
		System.out.println(livro1);
		ler.close();
	}
}