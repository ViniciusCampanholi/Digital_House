package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		int idade, genero, temperamento, qPessoas=0, qMasculino=0, qFeminino=0, qOutros=0, qCalmo, qNervoso, qAgressivo;
		
		Scanner sc = new Scanner(System.in);
		
		while(qPessoas <= 5) {
			System.out.println("Idade: ");
			idade = sc.nextInt();
			
			System.out.println("Genero (1-Masculino | 2-Feminino | 3-Outros): ");
			genero = sc.nextInt();
			
			System.out.println("Temperamento (1-Calma | 2-Nervosa | 3-Agressiva): ");
			temperamento = sc.nextInt();
			
			switch(genero) {
			case 1:
				qMasculino++;
				break;
			case 2:
				qFeminino++;
				break;
			case 3:
				qOutros++;
				break;
				default:
					System.out.println("Digite um dos numeros válidos!");
			}
			
			
		}

	}

}
