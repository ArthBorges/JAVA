package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static <T>void removeElemento(List<T> list){
		for(int i=list.size() - 1; i>= 0; i--) {
			if (i % 2 != 0) {
				list.remove(i);
			}
		}

		for (T elemento : list) {
			System.out.print(elemento+" ");
		}
		
		System.out.printf("\n");
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Integer> listInt = new ArrayList<>();
		List<String> listStr = new ArrayList<>();
		int n = ler.nextInt();
		
		for(int i=0; i<n; i++) {
			listInt.add(ler.nextInt());
		}
		for(int i=0; i<n; i++) {
			listStr.add(ler.next());
		}
		
		removeElemento(listInt);
		removeElemento(listStr);
		
		ler.close();
	}
}