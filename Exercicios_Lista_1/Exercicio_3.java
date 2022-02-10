package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		int qN1,qN2,qN3,qN4;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero 1: ");
		n1 = scanner.nextInt();
		
		System.out.println("Digite o numero 2: ");
		n2 = scanner.nextInt();
		
		System.out.println("Digite o numero 3: ");
		n3 = scanner.nextInt();
		
		System.out.println("Digite o numero 4: ");
		n4 = scanner.nextInt();
		
		qN1 = (int) Math.pow(n1, 2);
		qN2 = (int) Math.pow(n2, 2);
		qN3 = (int) Math.pow(n3, 2);
		qN4 = (int) Math.pow(n4, 2);
		
		if (n3 >= 1000) {
			System.out.println(n3);
		} else {
			System.out.println("Quadrado de "+n1 +" = "+qN1);
			System.out.println("Quadrado de "+n2 +" = "+qN2);
			System.out.println("Quadrado de "+n3 +" = "+qN3);
			System.out.println("Quadrado de "+n4 +" = "+qN4);
		}
	}

}
