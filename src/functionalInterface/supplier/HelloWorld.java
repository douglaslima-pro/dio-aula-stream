package functionalInterface.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class HelloWorld {

	public static void main(String[] args) {
		Supplier<String> helloWorld = () -> "Hello, world!";
		List<String> output = Stream.generate(helloWorld).limit(5).toList();
		output.forEach(System.out::println);
	}

}
