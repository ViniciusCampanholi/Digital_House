package Interfaces;

public interface Figuras 
{
	public String nomeInterface = "Figuras";
	
	//Metodos abstratos
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	//Metodos publicos sem implementa��o 
	public double getArea();
	public double getPerimetro();
	public double getDiagonal();
}