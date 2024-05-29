package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <li><strong>Desafio 4</strong> - Remova todos os valores ímpares:</li>
 * <p>
 * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 * </p>
 */
public class Desafio4 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		// predicate
		Predicate<Integer> numeroPar = numero -> {
			return numero % 2 == 0;
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		List<Integer> numerosPares = numeros
				.stream()
				.filter(numeroPar)
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("Números pares:");
		System.out.print("[");
		numerosPares.forEach(imprimirLista);
		System.out.println("]");
	}

}