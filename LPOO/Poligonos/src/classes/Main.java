package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = ler.nextLine();
		int numLados = ler.nextInt();
		double lado = ler.nextDouble();
		Quadrado quad1 = new Quadrado(nome, numLados, lado);
		System.out.println(quad1);
		lado = ler.nextDouble();
		quad1.setLado(lado);
		System.out.println(quad1);
		
		/*String nome = ler.nextLine();
		int numLados = ler.nextInt();
		double base = ler.nextDouble();
		double altura = ler.nextDouble();
		Triangulo tri1 = new Triangulo(nome, numLados, base, altura);
		System.out.println(tri1);*/
		
		ler.close();
	}
}