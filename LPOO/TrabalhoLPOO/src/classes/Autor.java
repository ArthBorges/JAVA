package classes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autor implements Valida{
	/*Utilização do método de validação de email disponível em:
	 * https://pt.stackoverflow.com/questions/68209/verificacao-de-email-em-java*/
	private static final String EMAIL_PATTERN = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	
	private String nome; 
	private String email; 
	private String instituicao;
	
	public Autor(String nome, String email, String instituicao) {
		this.nome = nome;
		//faz a verificação do email, se for válido é adicionado. 
		//Caso contrário é feito a leitura e verificação de um novo email
		if (validarEmail(email)) {
			this.email = email;
		}else {
			while(validarEmail(email) == false) {
				System.out.println("Email Inválido!");
				email = ler.next();
			}
			this.email = email;
		}
		this.instituicao = instituicao;
	}
	
	Scanner ler = new Scanner(System.in);
	
	@Override
	public boolean validarEmail(String email) {
		Matcher matcher = pattern.matcher(email);
	    return matcher.matches();
	}

	@Override
	public String toString() {
		return nome + ", " + email + ", Instituição: " + instituicao;
	}
	
}
