package Aula01;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double primeiroValor;
		double segundoValor;
		double soma, subtracao, multiplicacao, divisao;
		
		System.out.println("Digite o primeiro valor: ");
		primeiroValor = leitor.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		segundoValor = leitor.nextDouble();
		
		soma = primeiroValor + segundoValor;
		System.out.println("Resultado Soma: " + soma);
		
		subtracao = primeiroValor - segundoValor;
		System.out.println("Resultado Subtracão: " + subtracao);
		
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("Resultado Multiplicacão: " + multiplicacao);
		
		divisao = primeiroValor / segundoValor;
		System.out.println("Resultado Divisão: " + divisao);

	}

}
