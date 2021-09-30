import java.util.ArrayList;

public class classificaAnimal implements Animal{
	private String NomeEspecie;
	private String NomeAnimal;
	
	public classificaAnimal(String NomeEspecie, String NomeAnimal) {
		this.NomeEspecie = NomeEspecie;
		this.NomeAnimal = NomeAnimal;
	}
	@Override
	public String getNomeEspecie() {
		// TODO Auto-generated method stub
		return this.NomeEspecie;
	}

	@Override
	public String getNomeAnimal() {
		// TODO Auto-generated method stub
		return this.NomeAnimal;
	}

}
class filtraAnimal implements Ferramentas{

	@Override
	public Animal[] filtraespecie(Animal[] completo, String especieFiltrar) {
		ArrayList<Animal> filtrado = new ArrayList<Animal>();
		for(Animal i : completo) {
			if (i.getNomeEspecie() == especieFiltrar) {
				filtrado.add(i);
			}
		}

		Animal[] listaAnimal = new Animal[filtrado.size()];
		
        for (int i = 0; i < filtrado.size(); i++) {
        	listaAnimal[i] = filtrado.get(i);
        }
		return listaAnimal;
	}

	@Override
	public String[] classificarEspecies(Animal[] completo) {
		ArrayList<String> classifica = new ArrayList<String>();
		boolean c = false;
		for(Animal i : completo) {
			if (classifica.size() == 0) {
				classifica.add(i.getNomeEspecie());
			}
			else {
				for(String j : classifica) {
					if (j == i.getNomeEspecie()) {
						c = true;
						break;
					}
				}
				if(c == false) {
					classifica.add(i.getNomeEspecie());
				}
				c=false;
			}
		}
		
		String[] listaEspecie = new String[classifica.size()];
		
        for (int i = 0; i < classifica.size(); i++) {
        	listaEspecie[i] = classifica.get(i);
        }
		return listaEspecie;
	}
	
}