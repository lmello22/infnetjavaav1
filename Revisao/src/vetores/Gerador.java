package vetores;

public class Gerador {
	int tam;
	public static int[] GeraVetor(int tam) {

		int[] vetor = new int[tam]; // inicializando vetor
		for (int i = 0; i < vetor.length; i++) {
			int rnd = (int) (1 + Math.random() * 100); // colocando numero na
														// variavel random
			vetor[i] = rnd; // vetor recebe numero random
		}

		return vetor;

	}

	/*public static int[] gerarVetorOrdenado(int quant) {
		
		int[] vetor = Gerador.gerarVetor(quant);

		Ordenador.ordenar(vetor);

		return vetor;
	}*/

}
