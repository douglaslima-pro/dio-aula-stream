package functionalInterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {

		List<String> cores = new ArrayList<String>(Arrays.asList("Branco", "Preto", "Vermelho", "Azul", "Verde", "Amarelo", "Laranja", "Roxo", "Marrom", "Rosa", "Cinza", "Ciano", "Turquesa", "Dourado", "Prateado", "Bege", "Violeta", "Azeitona", "Índigo", "Magenta", "Lavanda", "Caqui", "Terracota", "Salmão", "Aquamarine", "Pêssego", "Malva", "Coral", "Orquídea", "Cobre", "Teal", "Ocre", "Carvão", "Granada", "Periwinkle", "Azul Celeste", "Siena", "Açafrão", "Esmeralda", "Íris", "Tangerina", "Fuchsia", "Índigo Claro", "Púrpura", "Carmin", "Sepia", "Limão", "Pistache", "Verde Água", "Cáqui", "Lima", "Topázio", "Bordo", "Âmbar", "Lilás", "Chumbo", "Framboesa", "Creme", "Búfalo", "Beringela", "Safira", "Bétula", "Ocre Amarelo", "Carmesim", "Siena Queimado", "Salmon", "Ouro Velho", "Carmim", "Violeta Escuro", "Turquesa Escuro", "Amêndoa", "Oliva", "Azul Marinho", "Orvalho", "Rosa Claro", "Laranja Escuro", "Verde Claro", "Marrom Escuro", "Carmesim Claro", "Pêssego Claro", "Azul Claro", "Verde Mar", "Castanho Escuro", "Amarelo Escuro", "Rosa Escuro", "Branco Gelo", "Verde Escuro", "Turquesa Claro", "Vermelho Escuro", "Verde Oliva", "Laranja Claro", "Marrom Claro", "Amarelo Claro", "Azul Escuro", "Roxo Escuro", "Azul Celeste Claro", "Salmão Claro", "Violeta Claro", "Açafrão Claro", "Verde Água Claro", "Ametista", "Carmim Escuro", "Cinza Escuro", "Vermelho Escarlate", "Violeta Escuro", "Cáqui Claro", "Ouro", "Laranja Escarlate", "Verde Menta", "Menta", "Céu Azul", "Açafrão Escuro", "Dourado Claro", "Açafrão", "Azul Escarlate", "Ciano Escuro", "Rosa Antigo"));

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira letra da cor: ");
		String primeiraLetra = String.valueOf(scanner.next().charAt(0)).toUpperCase();

		Predicate<String> filtro = cor -> {
			return String.valueOf(cor.charAt(0)).equalsIgnoreCase(primeiraLetra);
		};

		List<String> coresPelaPrimeiraLetra = cores
				.stream()
				.filter(filtro)
				.sorted()
				.collect(Collectors.toList());
		
		Consumer<String> consumer = cor -> {
			System.out.println("- " + cor);
		};
		
		System.out.println();
		if (!coresPelaPrimeiraLetra.isEmpty()) {
			System.out.println("Cores que começam com '" + primeiraLetra + "':");
			coresPelaPrimeiraLetra.forEach(consumer);
		} else {
			System.out.println("Não foi encontrada cor que começa com '" + primeiraLetra + "'!");
		}
	}

}
