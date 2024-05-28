package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.List;

public class Desafio5 {

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
		Predicate<Integer> numeroMaiorQueCinco = numero -> {
			return numero > 5;
		};
		
		// ToIntFunction
		ToIntFunction<Integer> intFunction = numero -> {
			return numero;
		};
		
		double mediaNumerosMaioresQueCinco = numeros
				.stream()
				.filter(numeroMaiorQueCinco)
				.mapToInt(intFunction)
				.average()
				.getAsDouble();
		
		System.out.println();
		System.out.printf("Média dos números maiores que 5: %.2f%n", mediaNumerosMaioresQueCinco);
	}

}
