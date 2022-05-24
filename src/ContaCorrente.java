
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);		
	}
	
	
	public void extratoBancario() {
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInformacoes();
	}
	
	

	
	
}
