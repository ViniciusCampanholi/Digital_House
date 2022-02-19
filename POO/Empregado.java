package POO;

import java.text.NumberFormat;

public class Empregado {
	private String nome;
	private double salario;
	
	public Empregado(String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario = salario * (percentual / 100);
	}
	
	public String formatarMoeda() {
		//Coloca a moeda do país
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		//Indica a quantidade de casas decimais depois da vírgula
		nf.setMinimumFractionDigits(2); 
		
		//Formata a variável |salario| para a formatação monetária
		String formatoMoeda = nf.format(salario);
		
		return formatoMoeda;
	}
	
	public void Imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Salario: "+this.formatarMoeda());
	}
}
