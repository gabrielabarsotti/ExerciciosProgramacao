package encapsulamento;

public class Pessoa {
	// Atributos privados
	private String nome;
	private int idade;

	// Construtor vazio
	// Pessoa pessoa1 = new Pessoa();
	// --> Passa a funcionar por conta desse construtor
	public Pessoa() {
	}
	
	// Construtor com Parâmetros
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Getter do Nome
	public String getNome() {
		return nome;
	}
	
	// Setter do Nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter da Idade
	public int getIdade() {
		return idade;
	}
	
	// Setter da Idade
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
	}
	} 

	
	
