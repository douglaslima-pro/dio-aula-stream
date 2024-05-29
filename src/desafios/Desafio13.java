package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <li><strong>Desafio 13</strong> - Filtrar os números que estão dentro de um intervalo:</li>
 * <p>
 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
 * </p>
 */
public class Desafio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		
		System.out.println();
		System.out.print("Digite o início do intervalo (incluído): ");
		int inicio = scanner.nextInt();
		
		System.out.println();
		System.out.print("Digite o fim do intervalo (excluído): ");
		int fim = scanner.nextInt();
		
		Predicate<Integer> verificarIntervalo = numero -> {
			return numero >= inicio && numero < fim;
		};
		
		List<Integer> intervalo =
				numeros
				.stream()
				.filter(verificarIntervalo)
				.sorted()
				.collect(Collectors.toList());

		System.out.println();
		System.out.print("[");
		intervalo.forEach(imprimirLista);
		System.out.println("]");
	}

}
