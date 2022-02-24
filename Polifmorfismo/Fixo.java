package Polifmorfismo;

public class Fixo extends Telefone{

	public Fixo() {
		super("Telefone fixo");
	}
	
	@Override
	public void toca(int numToques) {
		for (int i=0 ; i<numToques ; i++) {
			System.out.println("Trimmmmm... trimmmm");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("Discando: "+numero);
	}
}
