package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos verificar se um numero � par ou impar, e positivo ou negativo!\nDigite um n�mero: ");
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			if(number >= 0) {
				System.out.println("\nO numero "+number+ " � par e positivo");
			} else {
				System.out.println("\nO numero "+number+" � par e negativo");
			}
		} else if(number % 2 != 0) {
			if(number >= 0) {
				System.out.println("\nO numero "+number+ " � impar e positivo");
			} else {
				System.out.println("\nO numero "+number+" � impar e negativo");
			}
		}
	}

}
