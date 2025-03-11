package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        /* ------------------- ADICIONANDO AUTORES ---------------------------*/
        Autor autor1 = new Autor("Sun Tzu", "suntzuhotmail.com", "Novo Século");
        //Autor autor1 = new Autor("Sun Tzu", "suntzu@hotmail.com", "Novo Século");
        Autor autor2 = new Autor("Charlie Donlea", "charlied@gmail.com", "Faro Editorial");
        Autor autor3 = new Autor("Júnior Rostirola", "jrrustiola@gmail.com", "Vélos");
        Autor autor4 = new Autor("Kerri Maniscalco", "kerrim@gmail.com", "Darkside");
        Autor autor5 = new Autor("Ashley Audrain", "audrainashley@gmail.com", "Paralela");
        Autor autor6 = new Autor("Culturama", "culturamaofc@gmail.com", "Culturama");
        Autor autor7 = new Autor("Malcolm Gladwell", "gladwellm@gmail.com", "Sextante");
        Autor autor8 = new Autor("Leandro Karnal", "leandrokarnal@gmail.com", "Cia das Letras");
        Autor autor9 = new Autor("Rachel Aviv", "rachelaviv@gmail.com", "Zahar");
        Autor autor10 = new Autor("George Orwell", "ggorwell@gmail.com", "Tricaju");
        Autor autor11 = new Autor("Rebecca Yarros", "yarrosbecca@gmail.com", "Planeta Minotauro");
        Autor autor12 = new Autor("Jennifer L. Armentrout", "jenlarmentrout@gmail.com", "Galera");
        /* -------------------------------------------------------------------*/
        
        /* ------------------- ADICIONANDO LIVROS/EBOOKS ---------------------------*/
        LivroFisico livro1 = new LivroFisico("A Arte da Guerra", "908-0-16-141410-0", 44.9);
        LivroFisico livro2 = new LivroFisico("A Garota do Lago", "918-1-16-142410-1", 59.9);
        LivroFisico livro3 = new LivroFisico("Café com Deus Pai", "928-2-16-143410-2", 104.9);
        LivroFisico livro4 = new LivroFisico("Reino das Bruxas: Poder Arcano", "938-3-16-144410-3", 60.7);
        LivroFisico livro5 = new LivroFisico("O impulso", "948-4-16-145410-4", 64.9);
        LivroFisico livro6 = new LivroFisico("Os Tres Porquinhos", "958-5-16-146410-5", 44.7);
        Ebook livro7 = new Ebook("Fora de série - Outliers", "968-6-16-147410-6", 32.9);
        Ebook livro8 = new Ebook("Preconceito: uma história", "978-7-16-148410-7", 20.0);
        Ebook livro9 = new Ebook("Estranhos a nós mesmos", "988-8-16-149410-8", 39.9);
        Ebook livro10 = new Ebook("1984", "998-9-16-110410-9", 10.0);
        Ebook livro11 = new Ebook("Quarta Asa", "908-0-16-112410-0", 99.0);
        Ebook livro12 = new Ebook("A coroa de ossos dourados", "918-3-16-113410-1", 29.7);
        /* -------------------------------------------------------------------------*/
        
        /* ------- ADICIONANDO AUTORES AOS LIVROS -------*/
        livro1.adicionarAutor(autor1);
        //livro1.adicionarAutor(autor2);
        livro2.adicionarAutor(autor2);
        livro3.adicionarAutor(autor3);
        livro4.adicionarAutor(autor4);
        livro5.adicionarAutor(autor5);
        livro6.adicionarAutor(autor6);
        livro7.adicionarAutor(autor7);
        livro8.adicionarAutor(autor8);
        livro9.adicionarAutor(autor9);
        livro10.adicionarAutor(autor10);
        livro11.adicionarAutor(autor11);
        livro12.adicionarAutor(autor12);
        /* ----------------------------------------------*/
        
        /* ------- CRIANDO E ADICIONANDO LIVROS À BIBLIOTECA -------*/
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);
        biblioteca.adicionarLivro(livro9);
        biblioteca.adicionarLivro(livro10);
        biblioteca.adicionarLivro(livro11);
        biblioteca.adicionarLivro(livro12);
        /* ----------------------------------------------------------*/
        
        /* ------- EMPRESTANDO E DEVOLVENDO LIVROS -------*/
        biblioteca.emprestarLivro(livro2);
        biblioteca.emprestarLivro(livro4);
        biblioteca.emprestarLivro(livro8);
        biblioteca.emprestarLivro(livro10);
        biblioteca.emprestarLivro(livro11);
        biblioteca.emprestarLivro(livro12);
        
        biblioteca.devolverLivro(livro10);
        biblioteca.devolverLivro(livro11);
        biblioteca.devolverLivro(livro12);
        /* ----------------------------------------------------------*/
        
        /* ------- CRIANDO E ADICIONANDO LIVROS AO ORÇAMENTO -------*/
        Orcamento orc1 = new Orcamento();
        orc1.adicionarLivro(livro1);
        orc1.adicionarLivro(livro2);
        orc1.adicionarLivro(livro3);
        orc1.adicionarLivro(livro4);
        Orcamento orc2 = new Orcamento();
        orc2.adicionarLivro(livro5);
        orc2.adicionarLivro(livro6);
        orc2.adicionarLivro(livro7);
        orc2.adicionarLivro(livro8);
        Orcamento orc3 = new Orcamento();
        orc3.adicionarLivro(livro9);
        orc3.adicionarLivro(livro10);
        orc3.adicionarLivro(livro11);
        orc3.adicionarLivro(livro12);
        /* ---------------------------------------------------------*/
        
        /* ------------------------ MENU DE OPÇÕES ------------------------*/
        int op = 0;
        do {
        	System.out.println("_________________________________________________________________");
        	System.out.println("\n\t\tNavegar pela Biblioteca");
        	System.out.println("_________________________________________________________________");
            System.out.println("\n\t1 - Listar livros disponíveis na Biblioteca");
            System.out.println("\t2 - Listar todos os livros Emprestados");
            System.out.println("\t3 - Listar Pedidos de Compra");
            System.out.println("\t4 - Sair");
            System.out.println("_________________________________________________________________");
            System.out.printf("\n\tOpção: ");
            op = ler.nextInt();
            System.out.println("_________________________________________________________________");
            if (op == 1) {
            	biblioteca.imprimirLivros();
            }
            else if (op == 2) {
            	biblioteca.imprimirEmprestados();
            }
            else if (op == 3) {
            	orc1.listarPedidos();
            	orc2.listarPedidos();
            	orc3.listarPedidos();
            }

		} while (op != 4);
        /* ----------------------------------------------------------------*/
        ler.close();   
    }
}