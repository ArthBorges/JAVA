package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainDoiis {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();
        
        try {
	        for (int i = 0; i < 3; i++) {
	            String nome = ler.next();
	            int idade = ler.nextInt();
	            lista.add(new Pessoa(nome, idade));
	        	}
	        System.out.println(lista);
	        Pessoa p2 = lista.get(1);
	        int novaIdade = ler.nextInt();
            p2.setIdade(novaIdade);
            lista.set(1, p2);
            System.out.println("Total=" + lista.size()+" "+lista);
        }catch (InputMismatchException e) {
            System.out.println("Entrada Inválida!");
        }
        ler.close();
        
        /*		Scanner ler = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String nome = ler.next();
            try {
                int idade = ler.nextInt();
                lista.add(new Pessoa(nome, idade));
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida!");
            }
        }

        System.out.println(lista);
        Pessoa p2 = lista.get(1);
        try {
            int novaIdade = ler.nextInt();
            p2.setIdade(novaIdade);
            lista.set(1, p2);
        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida!");
        }

        System.out.println("Total=" + lista.size()+" "+lista);
        ler.close();*/
	}
}