package classes;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vet = {500,1000,1500,3000,5000};
		
		try {
			int op = ler.nextInt();
			for (int i = 0; i < vet.length; i++) {
				vet[i] /= op;
				System.out.printf("%d ", vet[i]);
			}}
			catch (ArithmeticException exception) {
				System.out.println("Erro de divisão por zero");
			}catch (InputMismatchException e) {
				System.out.println("Caractere inválido");
			}
		ler.close();
	}

}
