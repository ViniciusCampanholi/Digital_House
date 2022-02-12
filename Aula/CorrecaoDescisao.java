package Aula;

import java.util.Scanner;

public class CorrecaoDescisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número.\nVamos ver se ele é par ou impar e positivo ou negativo.");
		number = scanner.nextInt();
		
		if(number % 2 == 0 ) {
			System.out.println("\nPar");
		}else {
			System.out.println("\nImpar");
		}
		
		if (number > 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
	}

}