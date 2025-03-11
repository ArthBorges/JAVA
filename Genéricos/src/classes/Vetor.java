package classes;

import java.util.Scanner;

public class Vetor {
	
	public static <T extends Comparable <T>> T maiorValor(T[] vetor) {
		T maiorValor = vetor[0];
		
		for (T elem : vetor) {
			if(elem.compareTo(maiorValor) > 0)
				maiorValor = elem;
		}
		
		return maiorValor;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		Integer[] vet = new Integer[n];
		String[] vetS = new String[n];
		for (int i=0; i < n;i++) {
			vet[i] = ler.nextInt();
		}
		for (int i=0; i < n;i++) {
			vetS[i] = ler.next();
		}
		
		
		System.out.println("Maior inteiro: "+maiorValor(vet));
		System.out.println("Maior string: "+maiorValor(vetS));
		
		ler.close();
	}

}