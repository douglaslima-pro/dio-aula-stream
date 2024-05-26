package functionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class NumerosPares {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
		Consumer<Integer> imprimirNumerosPares = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		numeros.forEach(imprimirNumerosPares);
	}

}