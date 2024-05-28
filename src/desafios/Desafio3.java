package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

public class Desafio3 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		// predicate
		Predicate<Integer> verificaNumerosPositivos = numero -> {
			return numero > 0;
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		boolean numerosPositivos = numeros
				.stream()
				.allMatch(verificaNumerosPositivos);
		
		System.out.println();
		System.out.println("Todos números são positivos? " + numerosPositivos);
	}

}
