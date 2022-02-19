package POO;

public class TestarFuncionario {

	public static void main(String[] args) {
		Empregado[] empregado = new Empregado[3];
		
		empregado[0] = new Empregado("Ana Kélvia",10000);
		empregado[1] = new Empregado("Lucas Theberge",11000);
		empregado[2] = new Empregado("Letícia Toffoli",30000);

		for(Empregado roda:empregado) {
			roda.Imprimir();
		}
		
		System.out.println("**************************************");
		
		for(Empregado roda:empregado) {
			roda.aumentarSalario(10);
			roda.Imprimir();
		}
	}

}
