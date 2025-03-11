package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String marca = ler.next();
		String modelo = ler.next();
		String cor = ler.next();
		int numPortas = ler.nextInt();
		Carro car1 = new Carro(marca, modelo, cor, numPortas);
		System.out.println(car1);
		car1.acelerar();
		car1.frear();
		marca=ler.next();
		modelo = ler.next();
		cor = ler.next();
		double tamCorrente = ler.nextDouble();
		Moto moto1 = new Moto(marca, modelo, cor, tamCorrente);
		System.out.println(moto1);
		cor = ler.next();
		moto1.setCor(cor);
		System.out.println(moto1);
		ler.close();
	}

}
