package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.List;

/**
 * <li><strong>Desafio 11</strong> - Encontre a soma dos quadrados de todos os números da lista:</li>
 * <p>
 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 * </p>
 */
public class Desafio11 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		// ToIntFunction para calcular o quadrado dos números na lista
		ToIntFunction<Integer> calculaQuadrado = numero -> {
			return (int) Math.pow(numero, 2);
		};
		
		int somaQuadrados =
				numeros
				.stream()
				.mapToInt(calculaQuadrado)
				.sum();
		
		System.out.println();
		System.out.println("Soma dos quadrados de todos os números da lista =  " + somaQuadrados);
	}
}