package Exercicios_Lista_1;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		int c = 1234;
		float valorHora = 10, horaLimite = 50, horaExtra = 20;
		float n, e, valorExtra, valorTotal, valorSemExtra;
		String nome = "Vinicius";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		n = scanner.nextFloat();
		
		if (n > horaLimite) {
			e = n - horaLimite;
			valorExtra = e * horaExtra;
			valorTotal = valorExtra + (horaLimite*valorHora);
		} else {
			e = 0;
			valorExtra = 0;
			valorTotal = 0;
		}
		System.out.println("Nome: "+nome + "\nCodigo: "+c + "\nHoras totais trabalhadas: "+n + "\nHoras extras: "+e + "\nValor das horas extras: "+valorExtra + "\nSalario total: "+valorTotal);
		
	}
}