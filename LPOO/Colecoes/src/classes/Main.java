package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List lista = new ArrayList();	
		try {
			for(int i=0; i<3; i++) {
				String nome = ler.next();
				int idade = ler.nextInt();
				lista.add(new Pessoa(nome, idade));
			}
			System.out.println(lista);
		}catch(InputMismatchException e) {
			System.out.println("Entrada Inválida!");
		}
		
		int nIdade = ler.nextInt();
		lista.set(1, nIdade);
		System.out.println("Total="+lista.size()+" "+lista);
		
		ler.close();
		
		//Não está funcionando direito
	}
}