package Aula;

import java.util.Scanner;

public class Repeticao_doWhile {
	public static void main(String[] args) {
		int tabuada, x, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		x = 1;
		System.out.println("Qual a tabuada deseja consultar?");
		tabuada = sc.nextInt();
		
		System.out.println("Tabuada do "+tabuada);
		
		do {
			resultado = x*tabuada;
			System.out.println(x+" x "+tabuada+" = "+resultado);
			x++;
		} while(x <= 10);
	}
}
