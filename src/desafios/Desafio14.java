package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;
import java.util.Random;

/**
 * <li><strong>Desafio 14</strong> - Encontre o maior número primo da
 * lista:</li>
 * <p>
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado
 * no console.
 * </p>
 * <li><strong>Número primo</strong>: é aquele que é dividido por apenas um e
 * por ele mesmo.</li>
 */
public class Desafio14 {

	public static void main(String[] args) {
		Integer[] arrayNumeros = new Integer[20];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			Random random = new Random();
			arrayNumeros[i] = random.nextInt(100);
		}
		
		List<Integer> numeros = Arrays.asList(arrayNumeros);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros
		.stream()
		.sorted()
		.forEach(imprimirLista);
		System.out.println("]");
		
		// predicate para verificar se um número é primo ou não
		Predicate<Integer> numeroPrimo = numero -> {
			if (numero < 2) {
				// verifica se o número é menor que 2
				return false;
			} else if (numero == 2) {
				// verifica se o número é igual a 2
				return true;
			} else if (numero % 2 == 0) {
				// verifica se o número é par
				return false;
			}
			for (int i = 3; i <= Math.sqrt(numero); i++) {
				// verifica se o número é divisível pelo intervalo de 3 até a raiz quadrado do número (número ímpar)
				if (numero % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		int maiorNumeroPrimo =
				numeros
				.stream()
				.filter(numeroPrimo)
				.sorted(Comparator.reverseOrder())
				.mapToInt(numero -> numero)
				.max()
				.getAsInt();
		
		System.out.println();
		System.out.println("Maior número primo = " + maiorNumeroPrimo);
	}

}
