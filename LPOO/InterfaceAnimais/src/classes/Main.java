package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nomeC = ler.next();
		int nptsC = ler.nextInt();
		String nomeG = ler.next();
		int nptsG = ler.nextInt();
		String nomeP = ler.next();
		int nptsP = ler.nextInt();
		Cachorro dog = new Cachorro(nomeC, nptsC);
		Gato cat = new Gato(nomeG, nptsG);
		Papagaio pap = new Papagaio(nomeP, nptsP);
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(pap);
		
		ler.close();
	}

}
