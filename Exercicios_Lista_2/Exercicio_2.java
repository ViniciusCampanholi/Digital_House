package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		int par=0,impar=0,x,num;
		
		Scanner sc = new Scanner(System.in);
		
		for(x=1 ; x<=10 ; x++) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			if(num % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}
		System.out.println("quantidade de numeros pares: "+par+"\nquantidade de numeros impares: "+impar);
	}

}
