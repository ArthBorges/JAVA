package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainDois {
	public static <T> T procuraValor(Map<String,T> mapa, String chave) {
		return mapa.get(chave);
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		Map<String, Integer> mapa1 = new HashMap<>();
		Map<String, String> mapa2 = new HashMap<>();
		
		for (int i=0; i<n; i++) {
			mapa1.put(ler.next(), ler.nextInt());
		}
		for (int i=0; i<n; i++) {
			mapa2.put(ler.next(), ler.next());
		}
		String chave1 = ler.next();
		String chave2 = ler.next();
		System.out.println(chave1+" valor: "+procuraValor(mapa1, chave1));	
		System.out.println(chave2+" valor: "+procuraValor(mapa2, chave2));
		ler.close();
	}
}