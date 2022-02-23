package Herança;

public class Cliente extends Pessoa{

	private int pedido;
	private String enderecoEntrega;
	private double valorBruto;
	private double desconto;
	
	public Cliente(String nome, String endereco, String cpf, int telefone, int idade, int pedido, String enderecoEntrega, double valorBruto, double desconto) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.desconto = desconto;
		this.enderecoEntrega = enderecoEntrega;
		this.pedido = pedido;
		this.valorBruto = valorBruto;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void calcularPreco() 
	{
		double precoVenda = valorBruto - (valorBruto * (desconto/100));
		System.out.println("Preço de venda: " + precoVenda);
	}

	public void imprimirInfo() 
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço de cadastro: "+getEndereco());
		System.out.println("Enederço de entrega: "+enderecoEntrega);
		System.out.println("CPF: "+getCpf());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Numero de pedido "+pedido);
	}
}
