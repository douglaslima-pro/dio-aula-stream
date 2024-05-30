package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

/**
 * <li><strong>Desafio 15</strong> - Verifique se a lista contém pelo menos um
 * número negativo:</li>
 * <p>
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número
 * negativo e exiba o resultado no console.
 * </p>
 */
public class Desafio15 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		// predicate
		Predicate<Integer> numeroNegativo = numero -> {
			return numero < 0;
		};
		
		boolean temNumeroNegativo =
				numeros
				.stream()
				.anyMatch(numeroNegativo);
		
		System.out.println();
		System.out.println("Tem número negativo? " + temNumeroNegativo);
	}

}
