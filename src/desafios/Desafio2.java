package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.List;

/**
 * <li><strong>Desafio 2</strong> - Imprima a soma dos números pares da lista:</li>
 * <p>
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 * </p>
 */
public class Desafio2 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};

		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		//ToIntFunction
		ToIntFunction<Integer> retornaNumero = numero -> {
			return numero;
		};
		
		int somaNumerosPares = numeros
				.stream()
				.filter(numero -> numero % 2 == 0)
				.mapToInt(retornaNumero) // mapToInt retorna um stream do tipo Integer - IntStream - e aceita como argumento um objeto do tipo ToIntFunction - uma functional interface que recebe um argumento de um tipo e retorna um resultado do tipo int.
				.sum();
		
		System.out.println("Soma dos números pares = " + somaNumerosPares);
	}

}
