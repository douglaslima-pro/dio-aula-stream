package functionalInterface.consumer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Nomes {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>() {
			{
				add("Douglas");
				add("Camila");
				add("Lucas");
				add("Ana");
				add("Carlos");
				add("Bruna");
			}
		};
		System.out.println("Ordem de inserção:");
		nomes.forEach(nome -> System.out.println("- " + nome));

		Set<String> nomesOrdenados = new TreeSet<>(nomes);
		System.out.println();
		System.out.println("Ordem alfabética:");
		nomesOrdenados.forEach(nome -> System.out.println("- " + nome));
	}

}
