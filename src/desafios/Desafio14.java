package desafios;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.List;

/**
 * <li><strong>Desafio 14</strong> - Encontre o maior número primo da
 * lista:</li>
 * <p>
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado
 * no console.
 * </p>
 * <li><strong>Número primo</strong>: é aquele que é dividido por apenas um e
 * por ele mesmo.</li>
 */
public class Desafio14 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// predicate para verificar se um número é primo ou não
		Predicate<Integer> numeroPrimo = numero -> {
			return false;
		};
	}

}
