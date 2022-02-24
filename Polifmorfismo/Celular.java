package Polifmorfismo;

public class Celular extends Telefone{
	
	public Celular() 
	{
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("Shalamar... shalamar... ");
			break;
		case 2:
			System.out.println("Tananinanan... Tananinana...");
			break;
		case 3:
		default:
			System.out.println("Ta... tanana... tanana");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		System.out.println("O numero: "+numero+" é um celular...");
	}
}
