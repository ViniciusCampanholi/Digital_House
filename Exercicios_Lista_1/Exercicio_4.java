package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos verificar se um numero é par ou impar, e positivo ou negativo!\nDigite um número: ");
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			if(number >= 0) {
				System.out.println("\nO numero "+number+ " é par e positivo");
			} else {
				System.out.println("\nO numero "+number+" é par e negativo");
			}
		} else if(number % 2 != 0) {
			if(number >= 0) {
				System.out.println("\nO numero "+number+ " é impar e positivo");
			} else {
				System.out.println("\nO numero "+number+" é impar e negativo");
			}
		}
	}

}
