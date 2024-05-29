package desafios;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.List;

/**
 * <li><strong>Desafio 8</strong> - Somar os dígitos de todos os números da lista:</li>
 * <p>
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 * </p>
 */
public class Desafio8 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};
		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");
		// a functional interface binary operator recebe dois argumentos de um tipo e
		// retorna um resultado do mesmo tipo
		BinaryOperator<Integer> somarNumeros = (resultado, numero) -> {
			return resultado + numero;
		};
		int soma = numeros
				.stream()
				.mapToInt(numero -> numero)
				.sum();
		int somaTotal = numeros
				.stream()
				.reduce(0, somarNumeros);
		System.out.println();
		System.out.println("Soma total dos números (usando a função reduce) = " + somaTotal);
		System.out.println("Soma total dos números (usando a função sum) = " + soma);
	}

}