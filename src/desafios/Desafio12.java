package desafios;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.List;
import java.util.Locale;

/**
 * <li><strong>Desafio 12</strong> - Encontre o produto de todos os números da lista:</li>
 * <p>
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 * </p>
 */
public class Desafio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		// BinaryOperator
		BinaryOperator<Integer> calcularProduto = (numero1, numero2) -> {
			return numero1 * numero2;
		};
		
		int produto =
				numeros
				.stream()
				.reduce(1, calcularProduto);
		
		System.out.println();
		System.out.printf("Produto de todos os números da lista = %,d%n", produto);
	}

}
