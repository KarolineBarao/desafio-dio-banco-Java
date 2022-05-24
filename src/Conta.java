
public abstract class Conta {
	
	private static final Integer AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1 ;
	
	protected Integer agencia;
	protected Integer conta;
	protected Double saldo = 0.0;
	
	protected Cliente cliente;
	
	
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	
	
	public void sacar(double valor) {
		
		saldo = saldo - valor;
		
	}
	
	public void depositar(double valor) {
		 this.saldo += valor;
		
	}
	
	public void transferir(double valor, Conta contaDestino) {		
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInformacoes() {
		
			
			System.out.println("Titular: " + this.cliente.getNome());
			System.out.println(String.format("Agencia: %d", this.agencia));
			System.out.println(String.format("Conta: %d", this.conta));
			System.out.println(String.format("Saldo: %.2f", saldo));
		
	}
	


	public Integer getAgencia() {
		return agencia;
	}


	public Integer getConta() {
		return conta;
	}


	public Double getSaldo() {
		return saldo;
	}


	
	

}
