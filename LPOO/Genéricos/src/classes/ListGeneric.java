package classes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListGeneric {
	
	public static double somaList(ArrayList<? extends Number> list) {
		double soma = 0;
		
		for (Number num : list) {
			soma += num.doubleValue();
		}
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n=0;
			
		try {
			n = ler.nextInt();	
			ArrayList<Integer> listaInt = new ArrayList<>();
			ArrayList<Double> listaDouble = new ArrayList<>();
			while (true) {
				if (n <= 2) {
					System.out.println("Entrada Inválida");
				}else {
					break;
				}
			}
			for(int i=0; i<n;i++) {
				listaInt.add(ler.nextInt());
			}
			for(int i=0; i<n;i++) {
				listaDouble.add(ler.nextDouble());
			}
			
			System.out.println("Lista Inteiros: "+listaInt);
			System.out.println("Soma Inteiros: "+somaList(listaInt));
			System.out.println("Lista Doubles: "+listaDouble);
			System.out.println("Soma Doubles: "+somaList(listaDouble));
			
		}catch(InputMismatchException e) {
			System.out.println("Entrada Inválida");
		}	
	
		ler.close();
	}

}
