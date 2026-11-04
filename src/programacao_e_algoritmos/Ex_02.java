
package programacao_e_algoritmos;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double precoLivro, troco;

        System.out.print("Preço do livro: ");
        precoLivro = sc.nextDouble();

        troco = 100 - precoLivro;

        System.out.println("Troco: R$ " + troco);

        sc.close();

	}

}
