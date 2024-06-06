package canvasseisdoseis;

import java.util.Scanner;

public class LacosRepeticao2 {
	
	public static void main(String[] args) {
		// Laço de repetição While
		
		Scanner sc = new Scanner(System.in);
				
		int idade=0;
		int totalA=0, totalB=0; //Total A (21 anos) e Total B (50+).
				
		
		while (idade >=0 ) {
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			
			if (idade < 21 && idade > 0) {
				totalA ++;
			}
			
			if (idade > 50) {
				totalB ++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + totalA);
		System.out.println("Total de pessoas maiores de 50 anos: " + totalB);
		
			
		
		sc.close();

	}

}
