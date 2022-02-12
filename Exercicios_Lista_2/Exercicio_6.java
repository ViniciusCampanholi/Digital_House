package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		int num, soma=0, nMultiploDeTres=0;
		float media;

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			num = sc.nextInt();
			
			if(num> 0 && num % 3 == 0) {
				soma += num;
				nMultiploDeTres += 1; 
			}
		} while(num != 0);
		media = soma/nMultiploDeTres;
		System.out.println("A media dos multiplos de 3 digitados é : "+media);
	}
}