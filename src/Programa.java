
public class Programa {
	public static void main(String[] args) {
		
		Banco banco = new Banco();
	
		Cliente cliente1 =  new Cliente("Maria", "123455");
		Cliente cliente2 =  new Cliente("João", "123456");
		
		ContaCorrente contaCorrente = new ContaCorrente(cliente1);
		ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);
		
		contaCorrente.depositar(250);
		contaCorrente.transferir(50, contaPoupanca);
		
		contaCorrente.extratoBancario();
		System.out.println(" ");
		contaPoupanca.extratoBancario();
		
		banco.adicionarContas(contaCorrente);
		System.out.println(" ");
		banco.adicionarContas(contaPoupanca);
		banco.imprimirListaContas();
		
		
	
	
	}

}
