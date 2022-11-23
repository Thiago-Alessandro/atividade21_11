package atividade21_11;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5], matrizCubo[][] = new int [5][5];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 5;c++) {
			
			for(int l = 0;l< 5;l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
			}
		}
		
		System.out.print("\n\nMatriz elevada ao cubo: \n\n");
		
		for(int c = 0;c < 5;c++) {
			
			for (int l = 0; l < 5;l++) {
				
				matrizCubo[l][c] = matriz[l][c]*matriz[l][c]*matriz[l][c];
				System.out.print("\nO valor da linha: " + l + " coluna: " + c + " é: " + matrizCubo[l][c]);
			}
		}
		
	}

}
