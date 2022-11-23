package atividade21_11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		int matriz [][] = new int [5][5];
		double paresMedia = 0, paresSoma = 0, quantiaPares = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 5;c++) {
			
			for(int l = 0;l< 5;l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
				
				if (matriz[l][c]%2==0) {
					paresSoma += matriz[l][c];
					quantiaPares++;
				}
			}
		}
		paresMedia = paresSoma/quantiaPares;
		if (quantiaPares > 0) {
			System.out.println("A média dos números pares é: " + paresMedia);		
		}else {
			System.out.println("Não há números pares");
		}
			
	}

}
