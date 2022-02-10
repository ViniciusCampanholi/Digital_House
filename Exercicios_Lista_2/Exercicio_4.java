package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		int idade, genero, temperamento, qPessoas=0, qMasculino, qFeminino, qOutros, qCalmo, qNervoso, qAgressivo;
		
		Scanner sc = new Scanner(System.in);
		
		while(qPessoas <= 150) {
			System.out.println("Idade: ");
			idade = sc.nextInt();
			
			System.out.println("Genero (1-Masculino | 2-Feminino | 3-Outros): ");
			genero = sc.nextInt();
			
			System.out.println("Temperamento (1-Calma | 2-Nervosa | 3-Agressiva): ");
			idade = sc.nextInt();
			
		}

	}

}
