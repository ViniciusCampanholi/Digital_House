package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		float base, altura, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite em, cent�metros, a base e altura de um triangulo para calcular a �rea.");
		
		System.out.println("Base: ");
		base = sc.nextFloat();
		
		System.out.println("Altura: ");
		altura = sc.nextFloat();
		
		if(base>0 && altura>0) {
			area = (base * altura)/2;
			System.out.println("O trinagulo possui "+area+"cm de altura.");
		} else {
			System.out.println("Voc� entrou com n�meros negativos, e eles s�o inv�lidos.");
		}
		

	}

}
