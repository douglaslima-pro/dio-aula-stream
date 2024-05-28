package functionalInterface.binaryOperator;

import java.util.Arrays;
import java.util.List;

public class SomarNumeros {

	public static void main(String[] args) {
		// somando os elementos de um array usando um for
		Integer[] numeros = {10, 20, 30, 40, 50};
		Integer soma = somarNumeros(numeros);
		//output
		imprimirArray(numeros);
		System.out.println("Soma = " + soma);
		
		// somando os elementos de um array usando um stream
		List<Integer> listaDeNumeros = Arrays.asList(numeros);
		soma = listaDeNumeros
				.stream()
				.reduce(0, (resultado, numero) -> resultado + numero);
		// output
		System.out.println();
		System.out.print("[");
		listaDeNumeros.forEach(numero -> System.out.print(" " + numero + " "));
		System.out.println("]");
		System.out.println("Soma = " + soma);
	}
	
	public static Integer somarNumeros(Integer[] arr) {
		boolean contemNumeros = false;
		Integer resultado = 0;
		for (Integer numero : arr) {
			if (!contemNumeros) {
				contemNumeros = true;
				resultado = numero;
			} else {
				resultado = resultado + numero;
			}
		}
		return resultado;
	}
	
	public static void imprimirArray(Object[] arr) {
		System.out.print("[");
		for (Object o : arr) {
			System.out.print(" " + o + " ");
		}
		System.out.println("]");
	}

}
