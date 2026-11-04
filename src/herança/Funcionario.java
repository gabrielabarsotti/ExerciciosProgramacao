package herança;

public class Funcionario {
	String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome do funcionário: " + this.nome;
	}
}
