package vetores;

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		int tam;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o tamanho: ");
		tam = entrada.nextInt();

		int[] vetor = Gerador.GeraVetor(tam);

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(vetor[i] + " ");
		}

		int[] vet = Ordenador.OrdenaVetor(vetor);

		System.out.println("\n");

		for (int i = 0; i < vet.length; i++)

			System.out.printf(vet[i] + " ");

	}
}
