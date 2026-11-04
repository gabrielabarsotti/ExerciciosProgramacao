package herança;

import java.util.Objects;

class Produto {
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + " (R$ " + preco + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Produto produto = (Produto) obj;

		return Double.compare(produto.preco, preco) == 0 && Objects.equals(nome, produto.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco);
	}
}
