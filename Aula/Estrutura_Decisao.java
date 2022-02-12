package Aula;

import java.util.Scanner;

public class Estrutura_Decisao {
	public static void main(String[] args) {
		float n1,n2,result=0;
		String op;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		n1 = scanner.nextFloat();
		
		System.out.println("Numero 2: ");
		n2 = scanner.nextFloat();
		
		System.out.println("\n\n\tEscolha a operação:");
		op = scanner.next();
		
		switch(op)
		{
			case "+":
				result = n1+n2;
				break;
			case "-":
				result = n1-n2;
				break;
			case "*":
				result = n1*n2;
				break;
			case "/":
				if(n2 == 0) {
					System.out.println("Impossivel dividir por 0");
				} else {
					result = n1/n2;
				}
				break;
			default:
				System.out.println("Oeração inválida!");
		}
		System.out.println("Resultado: "+result);
	}
}
