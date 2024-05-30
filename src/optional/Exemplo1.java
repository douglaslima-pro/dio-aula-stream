package optional;

import java.util.Optional;

public class Exemplo1 {

	public static void main(String[] args) {
		Optional<Integer> optionalInteger = Optional.ofNullable(null);
		int valorInteiro = optionalInteger.orElse(0);
		System.out.println(valorInteiro);

		Optional<Double> optionalDouble = Optional.ofNullable(3.14);
		double valorDouble = optionalDouble.get();
		System.out.println(valorDouble);

		Optional<String> optionalString = Optional.ofNullable(null);
		try {
			String valorString = optionalString.orElseThrow(() -> {
				return new RuntimeException("Valor nulo presente no objeto do tipo Optional!");
			});
		} catch (RuntimeException e) {
			System.out.println("\tERRO => " + e.getMessage());
		}
		
		optionalString = Optional.ofNullable("Olá, mundo!");
		optionalString.ifPresent(System.out::println);
	}

}
