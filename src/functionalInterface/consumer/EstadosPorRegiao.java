package functionalInterface.consumer;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Consumer;

import enums.EstadoBrasileiro;

public class EstadosPorRegiao {

	/**
	 * <p>
	 * {@code Consumer} que imprime uma lista de elementos do tipo
	 * {@code EstadoBrasileiro}.
	 * </p>
	 */
	private static Consumer<EstadoBrasileiro> imprimirEstados = estado -> {
		System.out.printf("%10s %30s %20s %20d %20s%n",
				estado.getSigla(),
				estado.getNome(),
				estado.getCapital(),
				estado.getCodigoIBGE(),
				estado.getRegiao());
	};

	public static void imprimirEstadosPorRegiao(String regiao) {
		Stream<EstadoBrasileiro> streamEstadoBrasileiro = Arrays.stream(EstadoBrasileiro.values());
		List<EstadoBrasileiro> estadosBrasileiros =
				streamEstadoBrasileiro
				.filter(estado -> estado.getRegiao().equalsIgnoreCase(regiao))
				.toList();
		if (!estadosBrasileiros.isEmpty()) {
			System.out.println(
					"=========================================================================================================");
			System.out.println(regiao);
			System.out.println(
					"=========================================================================================================");
			estadosBrasileiros.forEach(imprimirEstados);
		}
	}
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println(
				"=========================================================================================================");
		System.out.printf("%10s %30s %20s %20s %20s%n",
				"SIGLA",
				"NOME",
				"CAPITAL",
				"COD. IBGE",
				"REGIÃO");
		imprimirEstadosPorRegiao("CENTRO-OESTE");
		imprimirEstadosPorRegiao("NORDESTE");
		imprimirEstadosPorRegiao("NORTE");
		imprimirEstadosPorRegiao("SUDESTE");
		imprimirEstadosPorRegiao("SUL");
	}
}