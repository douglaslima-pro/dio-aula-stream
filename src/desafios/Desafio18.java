package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.HashSet;
import java.util.List;

/**
 * <li><strong>Desafio 18</strong> - Verifique se todos os números da lista são
 * iguais:</li>
 * <p>
 * Utilizando a Stream API, verifique se todos os números da lista são iguais e
 * exiba o resultado no console.
 * </p>
 */
public class Desafio18 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		boolean saoTodosIguais =
				numeros
				.stream()
				.allMatch(numeros.get(0)::equals);

		System.out.println();
		System.out.println("Todos os números da lista são iguais? " + saoTodosIguais);
	}

}
