package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * <li><strong>Desafio 17</strong> - Filtrar os números primos da lista:
 * <p>
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o
 * resultado no console.
 * </p>
 */
public class Desafio17 {

	public static void main(String[] args) {
		Integer[] arrayInteger = new Integer[20];
		
		for (int i = 0; i < arrayInteger.length; i++) {
			Random random = new Random();
			arrayInteger[i] = random.nextInt(100);
		}
		
		List<Integer> numeros = Arrays.asList(arrayInteger);

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
		
		// predicate
		Predicate<Integer> numeroPrimo = numero -> {
			if (numero < 2) {
				return false;
			} else if (numero == 2) {
				return true;
			} else if (numero % 2 == 0) {
				return false;
			}
			for (int i = 3; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		List<Integer> numerosPrimos =
				numeros
				.stream()
				.filter(numeroPrimo)
				.sorted()
				.collect(Collectors.toList());

		System.out.println();
		System.out.println("Números primos:");
		System.out.print("[");
		numerosPrimos.forEach(imprimirLista);
		System.out.println("]");
	}

}
