package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		int idade;
		String grupo="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos classicar os nadadores!\nDigite a idade: ");
		idade = sc.nextInt();
		
		if(idade >= 5 && idade <=7) {
			grupo = "Infantil A";
		} else if(idade >= 8 && idade <=11) {
			grupo = "Infantil B";
		} else if(idade >= 12 && idade <13) {
			grupo = "Juvenil A";
		} else if(idade >= 14 && idade <=17) {
			grupo = "Juvenil B";
		} else {
			grupo = "não qualificado";
			if(idade <5) {
				System.out.println("idade inferior ao permitido.");
			} else {
				System.out.println("Idade superior ao permitido.");
			}
		}
		
		System.out.println("Grupo "+grupo);
	}

}
