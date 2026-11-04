package herança;

public class SistemaEstoque {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 3500.00);
		Produto p2 = new Produto("Notebook", 4000.00);

		System.out.println(p1);

		boolean saoIguais = p1.equals(p2);
		System.out.println("Os produtos têm os mesmos dados? " + saoIguais);
	}
}
