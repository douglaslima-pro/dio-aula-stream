package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.List;

public class Desafio7 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");

		int segundoMaiorNumero = numeros
				.stream()
				.sorted(Comparator.reverseOrder()) // Comparator.reverseOrder() retorna um Comparator que faz a ordenação inversa da ordenação natural
				.distinct() // remove os elementos duplicados
				.limit(2) // retorna uma stream limitada aos N primeiros elementos
				.skip(1) // remove os N primeiros elementos
				.findFirst() // retorna o primeiro elemento da stream
				.get(); // tenta retornar um valor do Optional<>
		
		System.out.println();
		System.out.println("Segundo número maior da lista: " + segundoMaiorNumero);
	}

}
