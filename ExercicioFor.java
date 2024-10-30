package lacosderepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		 * primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		 * ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		 * do programa. No intervalo informado, mostre na tela todes os números que são
		 * múltiplos de 3 e 5. Veja os exemplos abaixo:
		 */

		Scanner ler = new Scanner(System.in);

		int n3;

		System.out.println("Insira o primeiro numero: ");
		int n1 = ler.nextInt();

		System.out.println("Insira o segundo numero: ");
		int n2 = ler.nextInt();

		if (n1 >= n2) {

			System.out.println("Intervalo inválido");
		} else {
			System.out.println("");

			for (int i = n1; i <= n2; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}

		}

	}

}
