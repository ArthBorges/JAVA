package classes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;

public class MetList {

	public static void main(String[] args) {
			
		try {
			Scanner ler = new Scanner(System.in);
			List<String> lista = new LinkedList<>();
			for(int i=0; i<5; i++) {
				String itens = ler.next();
				lista.add(itens);
			}
			System.out.println(lista);
			int ind = ler.nextInt();
			System.out.println("Índice: "+ind+" "+lista.get(ind));
			Collections.sort(lista);
			System.out.println("Total="+lista.size()+" "+lista);
			ler.close();
		}catch(InputMismatchException e) {
			System.out.println("Entrada Inválida!");
			}catch(IndexOutOfBoundsException f) {
				System.out.println("Índice Inválido!");
				}
		
	}

}
