
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}
	
	public void extratoBancario() {
		System.out.println("*** Extrato Conta Poupan�a ***");
		super.imprimirInformacoes();
	}

}
