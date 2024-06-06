package canvasseisdoseis;

import java.util.Scanner;

public class LacosRepeticao1 {

	public static void main(String[] args) {
		 //  Laços de Repetição While e 1 exercício da lista
		 

		Scanner sc = new Scanner(System.in);
		
		
		int num1, num2;
		
		System.out.println("Digite o 1º número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = sc.nextInt();
		
		
			System.out.printf("No intervalo entre %d e %d%n", num1,num2);
			for (int i = num1; i<num2; i++) {
				if (i %3==0 && i %5==0) {
					System.out.println(i + ", é multiplo de 3 e 5.");
				}
			}
			
			if (num1 >= num2) {
			System.out.println("Condição inválida, tente novamente mais tarde.");
			return;
		}
		
		
		
		
		
		sc.close();
		

	}

}
