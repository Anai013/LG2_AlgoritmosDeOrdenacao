package algoritmos_de_ordenacao;

import java.util.Arrays;
import java.util.Random;

public class Aula2 {

	// Algoritmo de Ordenação Selection Sort

	public static void main(String[] args) {

		int[] k = gerarVetor(5);
		selectionSort(k);
		System.out.println(Arrays.toString(k));
	}

	private static void selectionSort(int[] k) {

		for (int i = 0; i < k.length; i++) {
			int menor = i;
			for (int j = i + 1; j < k.length; j++) {

				if (k[j] < k[menor])
					menor = j;
			}
			trocar(k, i, menor);
		}
	}

	private static void trocar(int[] k, int i, int menor) {
		int aux = k[i];
		k[i] = k[menor];
		k[menor] = aux;
	}

	private static int[] gerarVetor(int g) {
		int[] k = new int[g];
		Random gerador = new Random();
		for (int i = 0; i < g; i++) {
			k[i] = gerador.nextInt(100);
		}
		return k;
	}
}
