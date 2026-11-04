package encapsulamento;

public class Funcionario {
		// Atributos privados 
	    private String nome;
	    private String cpf;
	    private double salario;
	    private int idade;
	    private boolean ativo;

	    // Construtor vazio
	    public Funcionario() {
	    }

	    // Construtor com todos os parâmetros
	    public Funcionario(String nome, String cpf, double salario, int idade, boolean ativo) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.salario = salario; 
	        this.idade = idade;    
	        this.ativo = ativo;
	    }

	    // --- GETTERS E SETTERS ---
	    // Nome
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    // Cpf
	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    
	    // Salário
	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        if (salario >= 1200.00) { 
	            this.salario = salario;
	        } else {
	            System.out.println("Erro: O salário de " + this.nome + " não pode ser menor que o mínimo (R$ 1200.00).");
	        }
	    }
	    
	    // Idade
	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        if (idade >= 18 && idade < 80) {
	            this.idade = idade;
	        } else {
	            System.out.println("Erro: Idade inválida para o funcionário " + this.nome + ".");
	        }
	    }
	    
	    // Ativo
	    public boolean isAtivo() { // Para variáveis booleanas, costuma-se usar "is" em vez de "get"
	        return ativo;
	    }

	    public void setAtivo(boolean ativo) {
	        this.ativo = ativo;
	    }

	    // --- MÉTODO ESPECÍFICO DA CLASSE ---
	    // Método para aplicar aumento percentual
	    public void aplicarAumento(double percentual) {
	        if (percentual > 0 && ativo) {
	            double aumento = salario * (percentual / 100);
	            this.salario += aumento;
	            System.out.println("Aumento de " + percentual + "% aplicado com sucesso para " + this.nome + "\n");
	        } else {
	            System.out.println("Não foi possível aplicar o aumento. Verifique se o funcionário está ativo ou se o percentual é válido.");
	        }
	    }
	    
	    // Método para exibir o resumo do funcionário
	    public void exibirResumo() {
	        System.out.println("--- Resumo do Funcionário ---");
	        System.out.println("Nome: " + this.nome);
	        System.out.println("CPF: " + this.cpf);
	        System.out.println("Idade: " + this.idade + " anos");
	        System.out.println("Salário: R$ " + this.salario);
	        System.out.println("Status: " + (this.ativo ? "Ativo" : "Inativo"));
	        System.out.println("-----------------------------\n");
	    }
	}
