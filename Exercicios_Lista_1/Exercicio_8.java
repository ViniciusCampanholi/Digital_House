package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if(numero > 100) {
			System.out.println(numero);
		} else {
			numero = 0;
			System.out.println(numero);
		}
		
	}

}
