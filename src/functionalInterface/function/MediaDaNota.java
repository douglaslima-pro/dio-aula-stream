package functionalInterface.function;

import java.util.List;
import java.util.Arrays;

public class MediaDaNota {

	public static void main(String[] args) {
		Double[] notas = { 8.0, 6.0, 7.0, 5.0 };
		for (int i = 0; i < 4; i++) {
			System.out.printf("Nota %d: %.2f%n", i + 1, notas[i]);
		}
		// cria uma lista do tipo Double
		List<Double> listaDeNotas = Arrays.asList(notas);
		// calcula a media das notas
		double media = listaDeNotas
				.stream()
				.mapToDouble(nota -> nota)
				.average()
				.getAsDouble();
		System.out.printf("%nMédia: %.2f%n", media);
	}

}