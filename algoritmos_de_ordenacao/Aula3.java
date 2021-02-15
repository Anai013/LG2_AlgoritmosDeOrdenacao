package algoritmos_de_ordenacao;

// Funções Recursivas

public class Aula3 {

	// Fatorial não Recursivo:
	// 5! = 5 * 4 * 3 * 2 * 1 = 120
	// 0! = 1

	public static int fatorialNR(int num) {

		if (num == 0) {
			return 1;
		}

		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}

		return total;
	}

	// Fatorial Recursivo:
	// Fatorial (5) = 5 * fatorial(4)
	// Fatorial (4) = 4 * fatorial(3)
	// Fatorial (3) = 3 * fatorial(2)
	// Fatorial (2) = 2 * fatorial(1)
	// Fatorial (1) = 1 * fatorial(0)
	// Fatorial (0) = 1;

	public static int fatorialR(int num) {

		if (num == 0) {
			return 1;
		}

		return num * fatorialR(num - 1);
	}

}
