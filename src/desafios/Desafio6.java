package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

public class Desafio6 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};

		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");

		Predicate<Integer> numeroMaiorQueDez = numero -> {
			return numero > 10;
		};

		boolean contemNumeroMaiorQueDez = numeros
				.stream()
				.anyMatch(numeroMaiorQueDez);

		System.out.println();
		System.out.println("Contém número maior que 10? " + contemNumeroMaiorQueDez);

	}
}