package Interfaces;

public class TesteFiguras
{
	public static void main(String[] args)
	{
		//Instanciado os objetos
		Quadrado fig1 = new Quadrado(10, "Quadrado1");
		Retangulo fig2 = new Retangulo(3, 4, "Retangulo1");
		
		//Teste
		System.out.println(fig1.getNome() + " : " + fig1.getDiagonal());
		System.out.println("*******************************************");
		System.out.println(fig2.getNome() + " : " + fig2.getDiagonal());
	}
}