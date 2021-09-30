
public interface MovimentoConta {
	public String getCPFCorrentista();
	public float getValorMovimento();
}
interface OperacoesBanco{
	public Correntista encontraCorrentista(Correntista todosCorrentistas[], String cpfProcurado);
}
