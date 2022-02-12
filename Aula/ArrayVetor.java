package Aula;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		float[] media = new float[5];
		float n1, n2, n3, somaMedia=0, mediaGeral;
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		for(x=0 ; x<=4 ; x++) {
			System.out.println("Entre com a primeira nota:");
			n1 = sc.nextFloat();
			
			System.out.println("Entre com a segunda nota:");
			n2 = sc.nextFloat();
			
			System.out.println("Entre com a terceira nota:");
			n3 = sc.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			System.out.println("\nMedia: "+media[x]);
			
			somaMedia += media[x];
		}
		
		mediaGeral = somaMedia / x;
		System.out.println("\nMedia geral: "+mediaGeral);
	}
}
