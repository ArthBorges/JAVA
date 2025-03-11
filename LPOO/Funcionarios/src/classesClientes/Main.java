package classesClientes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nomeF = ler.next();
		String telefoneF = ler.next();
		double salarioF = ler.nextDouble();
		Funcionario func1 = new Funcionario(nomeF, telefoneF, salarioF);
		
		String nomeG = ler.next();
		String telefoneG = ler.next();
		double salarioG = ler.nextDouble();
		double bonus = ler.nextDouble();
		Gerente ger1 = new Gerente(nomeG, telefoneG, salarioG, bonus);
		
		String nome = ler.next();
		String telefone = ler.next();
		Cliente cli1 = new Cliente(nome, telefone);
		
		String nome1 = ler.next();
		String telefone1 = ler.next();
		int pontuacao = ler.nextInt();
		Cliente cli2 = new Cliente(nome1, telefone1, pontuacao);
		
		System.out.println(func1);
		System.out.println(ger1);
		System.out.println(cli1);
		System.out.println(cli2);
		
		salarioG = ler.nextDouble();
		ger1.setSalario(salarioG);
		System.out.println(ger1);
		
		ler.close();

	}

}
