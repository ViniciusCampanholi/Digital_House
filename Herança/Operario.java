package Herança;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao, double comissao) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.comissao = comissao;
		this.valorProducao = valorProducao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome operario: "+getNome());
		System.out.println("CPF: "+getCpf());
		System.out.println("Idade: "+getIdade());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Endereco: "+getEndereco());
		System.out.println("Valor produção: "+valorProducao);
		System.out.println("Comissão: "+comissao);
	}
	
	public void calcularProducao()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("O valor total a ser recebido por "+getNome()+" será de R$ "+valorTotal);
	}
}
