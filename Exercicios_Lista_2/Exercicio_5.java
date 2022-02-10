package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		int soma=0, numero;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			soma = soma+numero;
		} while(numero != 0);
		
		System.out.println("A soma dos numeros digitados: "+soma);
	} 
}