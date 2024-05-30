package functionalInterface.function;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;
import java.util.HashSet;
import java.util.Set;

import model.Produto;

public class CarrinhoCompras {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		Set<Produto> carrinhoCompras = new HashSet<>() {
			{
				add(new Produto(1, "Caneta Bic", 1.0, 5));
				add(new Produto(2, "Borracha", 0.5, 2));
				add(new Produto(3, "Caixa de Lápis de cor Faber Castell", 49.9, 1));
				add(new Produto(4, "Caderno 12 matérias 360 folhas", 29.9, 4));
				add(new Produto(5, "Mochila de couro", 129.9, 1));
				add(new Produto(6, "Estojo", 18.9, 1));
			}
		};
		Consumer<Produto> imprimirProduto = produto -> {
			System.out.printf("%10d %50s %,20.2f %10d%n", produto.getCodigo(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
		};
		System.out.println();
		System.out.printf("%10s %50s %20s %10s%n", "CÓDIGO", "NOME", "PREÇO (R$)", "QTD.");
		System.out.println();
		carrinhoCompras.forEach(imprimirProduto);
		ToDoubleFunction<Produto> calcularValorTotalProduto = produto -> {
			return produto.getPreco() * produto.getQuantidade();
		};
		double valorTotalCarrinho = carrinhoCompras
				.stream()
				.mapToDouble(calcularValorTotalProduto)
				.sum();
		System.out.println();
		System.out.printf("Valor total do carrinho de compras: R$ %,.2f", valorTotalCarrinho);
	}

}