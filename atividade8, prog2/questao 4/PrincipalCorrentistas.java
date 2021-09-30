import java.util.ArrayList;

public class PrincipalCorrentistas {
	public static void atualizaContas(Correntista[] contas, contasMovimentos[] movimentos, contasOperacoes ope) {
		for(contasMovimentos move: movimentos) {
			Correntista cont = ope.encontraCorrentista(contas, move.getCPFCorrentista());
			if (cont != null) {
				cont.setSaldo(cont.getSaldo() + move.getValorMovimento());
			}
		}
	}
	
	public static void main(String args[]) {
		Correntista pedro = new Correntista("12134-56",1000);
		Correntista luis = new Correntista("32045-57",1500);
		Correntista carl = new Correntista("46598-58",5000);
		ArrayList<Correntista> clientes = new ArrayList<Correntista>();
		clientes.add(pedro);
		clientes.add(luis);
		clientes.add(carl);
		
		Correntista[] listaclientes = new Correntista[clientes.size()];
		
        for (int i = 0; i < clientes.size(); i++) {
        	listaclientes[i] = clientes.get(i);
        }
        contasMovimentos movipedro = new contasMovimentos("12134-56", 50, 'd');
        contasMovimentos moviluis = new contasMovimentos("32045-57", 200, 'c');
        contasMovimentos movicarl = new contasMovimentos("46598-58", 150, 'c');
        ArrayList<contasMovimentos> movimentos = new ArrayList<contasMovimentos>();
        movimentos.add(movipedro);
        movimentos.add(moviluis);
        movimentos.add(movicarl);
        
        contasMovimentos[] listamovimentos = new contasMovimentos[movimentos.size()];
		
        for (int i = 0; i < movimentos.size(); i++) {
        	listamovimentos[i] = movimentos.get(i);
        }
        contasOperacoes operacao = new contasOperacoes();
        
        atualizaContas(listaclientes, listamovimentos, operacao);
        
        for(Correntista j : listaclientes) {
        	System.out.println("\ncpf: "+ j.getCpfCliente() + "\nsaldo: "+ j.getSaldo());
        }
	}
}
