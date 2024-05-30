package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <li><strong>Desafio 16</strong> - Agrupe os números em pares e ímpares:</li>
 * <p>
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma
 * contendo os números pares e outra contendo os números ímpares da lista
 * original, e exiba os resultados no console.
 * </p>
 */
public class Desafio16 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		// function para classificar os números em par ou ímpar
		Function<Integer, String> parOuImpar = numero -> {
			if (numero % 2 == 0) {
				return "par";
			} else {
				return "impar";
			}
		};

		Map<String, List<Integer>> mapNumeros =
				numeros
				.stream()
				.collect(Collectors.groupingBy(parOuImpar));
		
		List<Integer> numerosPares = mapNumeros.get("par");
		List<Integer> numerosImpares = mapNumeros.get("impar");
		
		System.out.println();
		System.out.println("Números pares:");
		System.out.print("[");
		numerosPares.forEach(imprimirLista);
		System.out.println("]");

		System.out.println();
		System.out.println("Números ímpares:");
		System.out.print("[");
		numerosImpares.forEach(imprimirLista);
		System.out.println("]");	
		
	}

}
