package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.HashSet;
import java.util.List;

/**
 * <li><strong>Desafio 9</strong> - Verificar se todos os números da lista são distintos (não se repetem):</li>
 * <p>
 * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 * </p>
 */
public class Desafio9 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		boolean numerosDistintos =
				numeros
				.stream()
				.allMatch(new HashSet<>()::add);

		System.out.println();
		
		System.out.println("Todos os números são distintos? " + numerosDistintos);
	}

}
