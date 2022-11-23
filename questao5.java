package atividade21_11;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {

		double matriz[][] = new double [3][4];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 4;c++) {
			
			for(int l = 0;l< 3;l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextDouble();
			}
		}
		
		for (int c = 0;c < 4;c++) {
			
			for(int l = 0;l< 3;l++) {
				
				if (l==0 && c==0) {
					
					System.out.println("O valor do canto esquerdo superior é: " + matriz[l][c]);
				}
				if(l==2 && c==0) {
					
					System.out.println("O valor do canto inferior esquerdo é: " + matriz[l][c]);
				}
				
			}
		}
		
	}

}
