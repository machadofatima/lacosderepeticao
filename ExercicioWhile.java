package lacosderepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int menores21 = 0;
		int maiores50 = 0;
		int idade;
		
		System.out.println("Insira sua idade: ");
		
		while(true) {
			idade = ler.nextInt();
		
		
		if(idade < 0) {
			break;
		}
		
		
		if(idade < 21) {
			menores21++;
		}
		
		else if(idade > 50) {
			maiores50++;
		}
		
		}
		
		System.out.println(menores21 + " pessoas menores de 21 anos");
		System.out.println(maiores50 + " pessoas maiores de 50 anos");
		
	}

	
}
