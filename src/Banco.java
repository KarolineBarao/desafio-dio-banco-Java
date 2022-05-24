import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	
	
	List<Conta> listaContas = new ArrayList<>();
	
	public Banco() {
		
	}

	public List<Conta> getListaContas() {
		return listaContas;
	}

	public void adicionarContas(Conta conta) {
		this.listaContas.add(conta);
	}
	
	public void imprimirListaContas() {
		System.out.println("\n *** TODAS AS CONTAS ***");
		for (Conta conta : listaContas) {
			
			conta.imprimirInformacoes();
			System.out.println(" ");
		}
	}

	
	

	
	
	
	
	

}
