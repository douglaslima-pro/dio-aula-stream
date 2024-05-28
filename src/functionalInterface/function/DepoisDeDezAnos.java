package functionalInterface.function;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

import model.Pessoa;

public class DepoisDeDezAnos {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>() {
			{
				add(new Pessoa("Ana", 19));
				add(new Pessoa("Bruna", 27));
				add(new Pessoa("Carlos", 39));
				add(new Pessoa("Henrique", 52));
				add(new Pessoa("Julia", 24));
				add(new Pessoa("Douglas", 21));
				add(new Pessoa("Kaio", 28));
				add(new Pessoa("Thiago", 18));
			}
		};

		// ordena a lista de Pessoa
		Collections.sort(pessoas);
		exibirPessoas(pessoas);
		
		// cria uma function
		Function<Pessoa, Pessoa> function = pessoa -> {
			pessoa.setIdade(pessoa.getIdade() + 10);
			return pessoa;
		};

		List<Pessoa> pessoasDezAnosDepois = pessoas
				.stream()
				.map(function)
				.sorted()
				.toList();
		
		System.out.println();
		System.out.println("Dez anos depois...");
		
		exibirPessoas(pessoasDezAnosDepois);
	}

	public static void exibirPessoas(List<Pessoa> pessoas) {
		System.out.println();
		if (!pessoas.isEmpty()) {
			System.out.printf("%20s %20s%n", "NOME", "IDADE");
			System.out.printf("%20s %20s%n", "----", "-----");
			pessoas.forEach(pessoa -> {
				System.out.printf("%20s %20d%n", pessoa.getNome(), pessoa.getIdade());
			});
		} else {
			System.out.println("Lista vazia!");
		}
	}

}