package POO;

public class TesteAutomavel {

	public static void main(String[] args) {
		//Instanciando um objeto da classe Automovel
		Automovel automovel = new Automovel("Rejane Santos","Celta","RSA-2J34",2015);
		
		automovel.ImprimirInfo();
		
		System.out.println("*******************");
		System.out.println("Transferencia de proprietario");
		
		automovel.setNomeProprietario("Vinicius Campanholi");
		System.out.println("*******************");
		automovel.ImprimirInfo();
	}
}
