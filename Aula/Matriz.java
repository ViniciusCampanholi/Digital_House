package Aula;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int [][] numeros = new int[2][3];
		int linha, coluna, somaPar=0, somaImpar=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(linha=0 ; linha<2 ; linha++) {
			for(coluna=0 ; coluna<3 ; coluna++) {
				System.out.println("Entre com um numero: ");
				numeros[linha][coluna] = sc.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0) {
					somaPar++;
				} else {
					somaImpar += numeros[linha][coluna];
				}
			}
		}
		
	}
}
