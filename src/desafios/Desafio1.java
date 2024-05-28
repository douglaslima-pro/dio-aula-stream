package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		List<Integer> numerosOrdenados = numeros
				.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("Ordem crescente:");
		System.out.print("[");
		numerosOrdenados.forEach(imprimirLista);
		System.out.println("]");
	}

}