package Exercicios_Lista_2;

public class Exercicio_1 {

	public static void main(String[] args) {
		int num;
		
		for(num=1000 ; num<=1999 ; num++) {
			if (num % 11 == 5) {
				System.out.println(num);
			}
		}
	}
}
