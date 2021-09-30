
public interface Animal {
	public String getNomeEspecie();
	public String getNomeAnimal();
}
interface Ferramentas{
	public Animal[] filtraespecie(Animal[] completo, String especieFiltrar);
	public String[] classificarEspecies(Animal[] completo);
}
