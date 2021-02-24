package Aula01;

import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome; 
		System.out.println("Por favor, escreva seu nome:");
		// next libera o usuario para digitar
		nome = leitor.next();
		System.out.println("Seu nome é: " + nome);
		leitor.close();
	}

}
