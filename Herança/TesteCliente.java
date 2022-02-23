package Herança;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Fabio Marcellus", "Rua Thuller, 828", "436.042.278-00", 1125460977, 25, 2503,"Rua Thuller, 828",10000,10);
	
		cliente.imprimirInfo();
		cliente.calcularPreco();
	}
}
