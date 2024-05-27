package functionalInterface.consumer;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Nomes {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>() {
			{
				add("Ana");
				add("Bruno");
				add("Carlos");
				add("Fernanda");
				add("Beatriz");
				add("Adriel");
				add("Diego");
				add("Camila");
				add("Zélia");
				add("Maria");
				add("Eduardo");
				add("Kaio");
				add("Juliana");
				add("Rafael");
				add("Luciana");
				add("Pedro");
				add("Mariana");
				add("Gabriel");
				add("Carolina");
				add("Matheus");
				add("Larissa");
				add("Vinicius");
				add("Aline");
				add("Lucas");
				add("Isabela");
				add("Thiago");
				add("Tatiane");
				add("Rodrigo");
				add("Patrícia");
				add("Guilherme");
				add("Daniela");
				add("Marcos");
				add("Julia");
				add("Leandro");
				add("Laura");
				add("Felipe");
				add("Renata");
				add("Gustavo");
				add("Cristina");
				add("Marcelo");
				add("Raquel");
				add("Henrique");
				add("Vanessa");
				add("Douglas");
				add("Débora");
				add("Antônio");
				add("Sandra");
				add("Wagner");
				add("Silvana");
				add("Leonardo");
				add("Fabiana");
			}
		};
		
		// primeira letra da String nome
		char primeiraLetra = 'L';
		
		// transforma a lista de nomes em um stream
		// filtra os nomes no stream pela primeira letra da String nome
		// retorna o stream como uma lista do tipo String
		List<String> nomesPelaPrimeiraLetra = nomes.stream().filter(nome -> nome.charAt(0) == primeiraLetra).toList();
		
		System.out.println("Nomes que começam com letra " + primeiraLetra + ":");
		
		// cria um consumer que recebe nome como argumento e imprime na tela
		Consumer<String> imprimirNomes = (nome) -> {
			System.out.println("- " + nome);
		};
		
		// chama o método forEach e passa o consumer como argumento
		nomesPelaPrimeiraLetra.forEach(imprimirNomes);
	}
}