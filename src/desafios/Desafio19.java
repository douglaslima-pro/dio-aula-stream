package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

/**
 * <li><strong>Desafio 19</strong> - Encontre a soma dos números divisíveis por
 * 3 e 5:</li>
 * <p>
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis
 * tanto por 3 quanto por 5 e exiba o resultado no console.
 * </p>
 */
public class Desafio19 {

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
		Predicate<Integer> diviseisPorTresOuCinco = numero -> {
			return numero % 3 == 0 || numero % 5 == 0;
		};
		
		int somaNumerosDiviseisPorTresOuCinco =
				numeros
				.stream()
				.filter(diviseisPorTresOuCinco)
				.mapToInt(numero -> numero)
				.sum();
		
		System.out.println();
		System.out.println("Soma dos números mútiplos de 3 e 5 = " + somaNumerosDiviseisPorTresOuCinco);

	}

}
