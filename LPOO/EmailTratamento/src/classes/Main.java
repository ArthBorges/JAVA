package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			String nome = ler.next();
			
			try {
	            int idade = ler.nextInt();
	            Usuario user1 = new Usuario(nome, idade);
				String senha = ler.next();
				user1.setSenha(senha);
				String email = ler.next();
				user1.criarEmail(email);
				System.out.println(user1);
	        } catch (Exception e) {
	            System.out.println("Entrada Inválida");
	            ler.next();
	        }
			ler.close();
	}
}
