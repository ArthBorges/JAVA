package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Celular implements Comparable<Celular>{
	private int codigo;
	private String marca;
	private String modelo;

	public Celular(int codigo, String marca, String modelo) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "COD:" + codigo + ",marca:" + marca + ",modelo:" + modelo;
	}

	@Override
	public int compareTo(Celular celular) {
		return this.marca.compareTo((celular).marca);
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Celular> lista = new ArrayList<>();
		
		try {
			for(int i=0; i<5; i++) {
				Celular cell = new Celular(ler.nextInt(), ler.next(), ler.next());
				lista.add(cell);
			}
		}catch(Exception e) {
			System.out.println("Entrada Inválida");
		}
		System.out.println(lista);
		Collections.sort(lista);
		Celular cellMenor = lista.get(0);
		System.out.println("O menor elemento é: "+cellMenor);
		System.out.println(lista);
		
		ler.close();
	}

}
