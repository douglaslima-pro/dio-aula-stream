package functionalInterface.supplier;

import java.util.function.Supplier;
import java.util.Random;
import java.util.stream.Stream;
import java.util.List;
import java.util.Collections;

public class NumerosPares {

	public static void main(String[] args) {
		Supplier<Integer> geradorDeNumeros = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		List<Integer> numerosPares = Stream // classe stream
				.generate(geradorDeNumeros) // retorna um stream de elementos gerados por um Supplier
				.limit(20) // retorna um stream com n elementos
				.filter(numero -> numero % 2 == 0) // filtra os elementos usando um predicate
				.sorted() // ordena os elementos de acordo com a ordem natural dos elementos
				.toList(); // retorna uma lista
		numerosPares.forEach(System.out::println); // usa um method reference para imprimir cada elemento da lista
	}
}