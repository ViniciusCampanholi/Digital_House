package Heranca;

public class Funcionario extends Pessoa 
{
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Funcionario(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Endere�o: "+getEndereco());
		System.out.println("CPF: "+getCpf());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Idade: "+getIdade());
		System.out.println("Setor: "+codigoSetor);
		System.out.println("Salario base: "+salarioBase);
		System.out.println("Valor de Imposto sobre salario: "+imposto);
	}
	
	public void calcularSalario()
	{
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		
		System.out.println("\nO salario total do funcionario "+getNome()+" � igual a "+salarioLiquido);
	}
}
