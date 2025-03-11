package classes;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        Map<Object, Object> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            Object key = ler.next();
            Object valor = ler.next();
            map.put(key, valor);
        }

        Object busca = ler.next();

        try {
            Object valor = map.get(busca);
            if (valor != null) {
                System.out.println("Valor da chave(" + busca + ")=" + valor);
            } else {
                System.out.println("Valor da chave(" + busca + ")=null");
            }
        } catch (NullPointerException e) {
            System.out.println("Valor da chave(" + busca + ")=null");
        }

        System.out.println("Quantidade de elementos: " + map.size());
		ler.close();
	}

}