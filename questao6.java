package atividade21_11;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [7][8];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 8;c++) {
			
			for(int l = 0;l< 7;l++) {
				
				matriz[l][c] = l + c;
			}
		}
		
		for (int c = 0;c < 8;c++) {
			
			for(int l = 0;l< 7;l++) {
				
				System.out.print("\nO valor da linha: " + l + " coluna: " + c + " é: " + matriz[l][c]);
			}
		}
	}

}
