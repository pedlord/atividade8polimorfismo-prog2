import java.util.ArrayList;

public class Principal {
	public static Resultado[] contabiliza(classificaAnimal[] vetor, filtraAnimal conta) {
		ArrayList<Resultado> resultado = new ArrayList<Resultado>();
			
		String[] animais = conta.classificarEspecies(vetor);
		int total = 0;
		
		for(String i : animais) {
			Animal[] listaAE = conta.filtraespecie(vetor, i);
			int tamanho = listaAE.length;
			for (int j = 0; j < tamanho; j++) {
				total++;
			}
			/*for(Animal j : listaAE) {
				total++;
			}*/
			Resultado res = new Resultado(i, total);
			resultado.add(res);
			total = total - total;
		}
		Resultado[] resultadofinal = new Resultado[resultado.size()];
		
        for (int i = 0; i < resultado.size(); i++) {
        	resultadofinal[i] = resultado.get(i);
        }
       // System.out.printf("Total de elementos arrayNum: %d\n", total);
		return resultadofinal;
	}
	public static void main(String args[]) {
		classificaAnimal bacuru = new classificaAnimal("peixe", "bacuru");
		classificaAnimal papagaio = new classificaAnimal("ave","papagaio");
		classificaAnimal falcao = new classificaAnimal("ave", "falcao");
		ArrayList<classificaAnimal> animais = new ArrayList<classificaAnimal>();
		animais.add(falcao);
		animais.add(bacuru);
		animais.add(papagaio);
		
		classificaAnimal[] listaAnimal = new classificaAnimal[animais.size()];
		
        for (int i = 0; i < animais.size(); i++) {
        	listaAnimal[i] = animais.get(i);
        }
        filtraAnimal  filtra = new filtraAnimal ();
        Resultado[] resultados = contabiliza(listaAnimal, filtra);
        for(Resultado i : resultados) {
        	System.out.println("especie: "+ i.getNomeEspecie() + "\nquantidade: "+ i.getQuantidade());
        }
	}
}
