package Interfaces;

//Superclass
public class BaseFigura 
{
	//Atributos protegidos
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	//Construtor
	BaseFigura(double lado1, double lado2, String nome)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}
	
	//Tem na interface
	public double getArea() 
	{
		return lado1 * lado2;
	}
	
	//Tem na interface
	public double getPerimetro() 
	{
		return (lado1 + lado2) * 2.0;
	}
	
	//Tem na interface
	public String getNome() 
	{
		return nome;
	}
	
	//Tem na interface
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
}
