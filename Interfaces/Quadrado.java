package Interfaces;

//Subclasse Quadrado herda de base figura e implementa a inteface Figuras
public class Quadrado extends BaseFigura implements Figuras
{
	Quadrado(double lado,  String nome)
	{
		super(lado, lado, nome);
		nomeClasse = "Quadrado";
	}
	
	@Override //Sobreescreve o método getDiagonal()
	public double getDiagonal()
	{
		return Math.sqrt(2 * lado1);
	}
}