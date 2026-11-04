
package programacao_e_algoritmos;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        String nome;
        int idade, dias;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Idade: ");
        idade = sc.nextInt();

        dias = idade * 365;

        System.out.println(nome + " você já viveu " + dias + " dias");

        sc.close();
  
	}

}
 