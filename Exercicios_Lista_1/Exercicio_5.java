package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		float indiceMedido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o índice de poluição medido: ");
		indiceMedido = sc.nextFloat();
		
		if(indiceMedido > 0.25 && indiceMedido <= 0.3){
			System.out.println("Convocar as indústrias do 1º grupo!");
		} else if(indiceMedido > 0.3 && indiceMedido <= 0.4) {
			System.out.println("Convocar as indústrias do 1º e 2º grupo!");
		} else if(indiceMedido >= 0.5) {
			System.out.println("Convocar todas as indústrias!");
		}
	}

}
