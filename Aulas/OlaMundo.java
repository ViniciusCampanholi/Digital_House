package Aulas;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		String nome, status;
		int idade;
		float altura, nota1, nota2, nota3, media, raiz, potencia; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá mundo!!!");
		
		System.out.println("Entre com o seu nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Qual sua idade? ");
		idade = scanner.nextInt();
		
		System.out.println("Qual a sua alura? ");
		altura = scanner.nextFloat();
		
		System.out.println("Entre com a nota 1");
		nota1 = scanner.nextFloat();
		
		System.out.println("Entre com a nota 2");
		nota2 = scanner.nextFloat();
		
		System.out.println("Entre com a nota 3");
		nota3 = scanner.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;		
		raiz = (float) Math.sqrt(media); 
		potencia = (float) Math.pow(media, 2);
		
		if(media >= 7 && media <= 10) {
			status = "aprovado";
		} else {
			status = "Reprovado";
		}
		
		System.out.println("\nNome: "+nome + "\nIdade: "+idade + "\nAltura: "+altura + "\nMedia: "+media + "\nRaiz quadrada da media: "+raiz + "\nPotencia: "+potencia + "\nStatus: "+status);
		
	}
}