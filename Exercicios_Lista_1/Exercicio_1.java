package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pesoEstabelecido = 50, multaPorKilo = 4;
				
		float p, e, m;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o peso dos total dos tomates? ");
		p = scanner.nextFloat();
		
		
		if(p > pesoEstabelecido) {
			e = p - pesoEstabelecido;
			m = e * multaPorKilo;
			m = m*1;
			
		} else {
			e = 0;
			m = 0;
		}
		System.out.println("Peso total: "+p + "\nExcedente: "+e + "\nMulta: "+m);
	}

}
