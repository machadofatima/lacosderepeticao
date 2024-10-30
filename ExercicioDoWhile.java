package lacosderepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		 * números digitados, que sejam positivos.
		 */

		Scanner ler = new Scanner(System.in);

		int numeros;
		int total = 0;

		System.out.println("Digite os números: ");
		numeros = ler.nextInt();

		do {

			if (numeros > 0) {
				total = total + numeros;

			}

			numeros = ler.nextInt();

		}

		while (numeros != 0);

		System.out.println(total + " números positivos");

	}

}
