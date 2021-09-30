
public class contasMovimentos implements MovimentoConta {
	private String cpfCorrentista;
	private float ValorMovimento;
	private char operacao;
	
	public contasMovimentos(String cpfCorrentista, float ValorMovimento, char operacao) {
		this.cpfCorrentista = cpfCorrentista;
		this.ValorMovimento = ValorMovimento;
		this.operacao = operacao; //d para debito, c para credito
	}
	
	@Override
	public String getCPFCorrentista() {
		return this.cpfCorrentista;
	}

	@Override
	public float getValorMovimento() {
		if (operacao == 'd') {
			float debito = this.ValorMovimento * -1;
			return debito;
		}
		return this.ValorMovimento;
	}
	
}
class contasOperacoes implements OperacoesBanco{

	@Override
	public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {
		for(Correntista i : todosCorrentistas) {
			if (i.getCpfCliente() == cpfProcurado) {
				return i;
			}
		}
		return null;
	}
	
}
