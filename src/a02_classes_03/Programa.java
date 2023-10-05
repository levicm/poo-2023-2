package a02_classes_03;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Produto prod1 = new Produto("TV");
		Produto prod2 = new Produto("Notebook");
		System.out.println("Total de produtos criados: " + Produto.getProdutosCriados());

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do produto:");

		System.out.println("Nome:");
		Produto produto = new Produto(sc.next());

		System.out.println("Preco:");
		produto.setPreco(sc.nextDouble());

		System.out.println("Quantidade em estoque:");
		produto.setQuantidade(sc.nextInt());

		System.out.println("Dados do produto:" + produto);

		System.out.println("Quantidade a ser adicionada ao estoque:");
		produto.adicionaAoEstoque(sc.nextInt());

		System.out.println("Dados do produto:" + produto);

		System.out.println("Quantidade a ser removida do estoque:");
		produto.removeDoEstoque(sc.nextInt());

		System.out.println("Dados do produto:" + produto);

		sc.close();
	}

}
