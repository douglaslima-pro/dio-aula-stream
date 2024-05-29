package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <li><strong>Desafio 10</strong> - Agrupe os valores ímpares múltiplos de 3 ou de 5:</li>
 * <p>
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 * </p>
 */
public class Desafio10 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};

		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		// função de classificação dos elementos
		Function<Integer, Integer> function = numero -> {
			if (numero % 5 == 0) {
				return 5;
			} else if (numero % 3 == 0) {
				return 3;
			} else {
				return 1;
			}
		};
		
		Map<Integer, List<Integer>> map =
				numeros
				.stream()
				.filter(numero -> numero % 2 != 0)
				.collect(Collectors.groupingBy(function));
		
		System.out.println();
		System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5.");
		
		System.out.println();
		System.out.println("Múltiplos de 5:");
		System.out.print("[");
		map.get(5).forEach(imprimirLista);
		System.out.println("]");
		
		System.out.println();
		System.out.println("Múltiplos de 3:");
		System.out.print("[");
		map.get(3).forEach(imprimirLista);
		System.out.println("]");
	}

}