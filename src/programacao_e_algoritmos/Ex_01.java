
package programacao_e_algoritmos;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double precoLitro, valorPago, litros;
		
		System.out.print("Preço do litro: ");
		precoLitro = sc.nextDouble();
		
		System.out.print("Valor pago: ");
		valorPago = sc.nextDouble();
		
		litros = valorPago / precoLitro;
		
		System.out.println("Litros abastecidos: " + litros );
		sc.close();
		
	}
	
}