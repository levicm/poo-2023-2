package a02_classes_02;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
		
	public Produto(String nome) {
		this.nome = nome;
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void adicionaAoEstoque(int qtd) {
		this.quantidade += qtd;
		// Atualizar a contabilidade
		ContaContabil conta = new ContaContabil();
		conta.processarContabilidade(this);
	}

	public void removeDoEstoque(int qtd) {
		if (qtd <= this.quantidade) {
			this.quantidade -= qtd;
		}
	}
	
	@Override
	public String toString() {
		return this.nome + ", $" + this.preco + ", Qtd: " + this.quantidade + ", Total: " + (quantidade * preco);
	}
}
