package algoritmos_de_ordenacao;

public class Aula1 {

	// Algoritmo de Ordenação Bubble Sort

	public static void main(String[] args) {

		int k[] = { 40, 16, 2, 23, 58, 34 };
		int i, j, aux;
		boolean controle;

		// Ordem Crescente

		for (i = 0; i < k.length; i++) {
			controle = true;
			for (j = 0; j < (k.length - 1); j++) {

				if (k[j] > k[j + 1]) {
					aux = k[j];
					k[j] = k[j + 1];
					k[j + 1] = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}
		}

		System.out.println("Vetor em ordem crescente: ");
		for (i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}

		// Ordem decrescente

		for (i = 0; i < k.length; i++) {
			controle = true;
			for (j = 0; j < (k.length - 1); j++) {

				if (k[j] < k[j + 1]) {
					aux = k[j];
					k[j] = k[j + 1];
					k[j + 1] = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}
		}

		System.out.println("\nVetor em ordem decrescente: ");
		for (i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");

		}

	}
}
