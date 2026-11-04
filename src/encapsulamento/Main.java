package encapsulamento;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Gabi", 22);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
		
		pessoa1.setNome("Ryu");
		pessoa1.setIdade(16);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
		
		Pessoa pessoa2 = new Pessoa("Cat", 15);
		
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.getIdade());
	}
}
