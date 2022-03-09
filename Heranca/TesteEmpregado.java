package Heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Funcionario("Vinicius Campanholi", "Rua Thuller, 828", "455.397.308-10", 976025362, 26, 1234, 20000, 15);

		funcionario.imprimirInfo();
		funcionario.calcularSalario();
	}
}
