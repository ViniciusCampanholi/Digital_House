package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		int idade, somaIdade=0, menos21=0, mais50=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(somaIdade < 100) {
			System.out.println("Digite a idade de uma pessoa: ");
			idade = sc.nextInt();
			
			if(idade < 21) {
				menos21+=1;
			} else if(idade > 50) {
				mais50+=1;
			}
			somaIdade = somaIdade + idade;
		}
		
		System.out.println("Pessoas com menos de 21 anos: "+menos21+"\nPessoas com mais de 50 anos: "+mais50);
	}

}
