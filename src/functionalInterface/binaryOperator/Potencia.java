package functionalInterface.binaryOperator;

import java.util.function.Supplier;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Potencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		int base = scanner.nextInt();
		
		System.out.print("Digite o valor do expoente: ");
		int expoente = scanner.nextInt();
		
		System.out.println();
		
		try {
			int potencia = pow(base, expoente);
			System.out.printf("%d ^ %d = %d%n", base, expoente, potencia);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
		System.out.println();
		System.out.println("Programa encerrado.");
	}

	public static int pow(int base, int expoente) throws IllegalArgumentException {
		if (expoente < 0) {
			throw new IllegalArgumentException("Expoente deve ser positivo!");
		}
		Supplier<Integer> retornaBase = () -> base;
		int potencia = Stream
				.generate(retornaBase)
				.limit(expoente)
				.reduce(1, (resultado, numero) -> resultado * numero);
		return potencia;
	}

}
