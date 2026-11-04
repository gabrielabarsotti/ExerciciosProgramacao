package encapsulamento;

public class Main2 {
	public static void main(String[] args) {

		// Novo funcionário
		Funcionario func1 = new Funcionario("Gabriela", "111.222.333-44", 2000.00, 22, true);
		func1.exibirResumo();
		
		// Aplicando aumento
		System.out.println(">>> Aplicando aumento...");
		func1.aplicarAumento(10); 

		// Outro funcionário 
		Funcionario func2 = new Funcionario("Catarina", "999.888.777-66", 500.00, 15, false);
		func2.exibirResumo();

		System.out.println(">>> Aplicando aumento...");
		func2.aplicarAumento(15);

	}
}