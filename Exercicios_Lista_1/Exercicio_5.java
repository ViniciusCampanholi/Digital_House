package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		float indiceMedido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o �ndice de polui��o medido: ");
		indiceMedido = sc.nextFloat();
		
		if(indiceMedido > 0.25 && indiceMedido <= 0.3){
			System.out.println("Convocar as ind�strias do 1� grupo!");
		} else if(indiceMedido > 0.3 && indiceMedido <= 0.4) {
			System.out.println("Convocar as ind�strias do 1� e 2� grupo!");
		} else if(indiceMedido >= 0.5) {
			System.out.println("Convocar todas as ind�strias!");
		}
	}

}
