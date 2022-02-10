package Aulas;

import java.util.Scanner;

public class Repeticao_While {

	public static void main(String[] args) {
		float n1, n2, n3, media, somaMedia=0, mediaGeral;
		
		Scanner sc = new Scanner(System.in);
		
		for(int x=1 ; x<=5 ; x++){
			System.out.println("Entre com a nota 1: ");
			n1 = sc.nextFloat();
			
			System.out.println("Entre com a nota 2: ");
			n2 = sc.nextFloat();
			
			System.out.println("Entre com a nota 3: ");
			n3 = sc.nextFloat();
			
			media = (n1+n2+n3)/3;
			somaMedia = somaMedia+ media;
		}
		mediaGeral = somaMedia / 5;
		System.out.println("A media geral: "+mediaGeral);
	}

}
