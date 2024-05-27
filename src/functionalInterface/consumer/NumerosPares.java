package functionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Random;

public class NumerosPares {

	public static void main(String[] args) {
		// array de inteiros
		int[] numerosAleatorios = new int[20];
		// objeto do tipo Random
		Random random = new Random();
		for (int i = 0; i < numerosAleatorios.length; i++) {
			// chamada o método nextInt(int limite)
			// gera um número aleatório entre 0 e limite (exclusive)
			numerosAleatorios[i] = random.nextInt(100);
		}
		// converte o array de inteiros para o tipo IntStream
		IntStream streamDeInteiros = Arrays.stream(numerosAleatorios);
		// converte o IntStream para um stream
		Stream<Integer> stream = streamDeInteiros.boxed();
		List<Integer> numerosPares =stream
				.filter(numero -> numero % 2 == 0)
				.sorted()
				.toList();
		numerosPares.forEach(System.out::println);
	}
}