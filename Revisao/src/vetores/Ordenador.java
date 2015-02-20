package vetores;

public class Ordenador {

	public static int[] OrdenaVetor(int[] vet) {

		int auxiliar;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {

				if (vet[j] > vet[j + 1]) {
					auxiliar = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = auxiliar;

				}

			}
		}
		return vet;
	}
}
