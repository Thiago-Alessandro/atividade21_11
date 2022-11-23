package atividade21_11;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
	
		int matriz[][] = new int [7][4];
		int menorValor = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 4;c++) {
			
			for(int l = 0;l< 7;l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
				
				if(matriz[l][c]<menorValor||l==0 && c==0) {
					
					menorValor = matriz[l][c];
				}
			}
		}
		System.out.print("O menor valor é: " + menorValor);
		System.out.print("\nO valor pode ser encontrado nas posições: \n");
		for (int c = 0;c < 4;c++) {
			
			for(int l = 0;l< 7;l++) {
				
				if (matriz[l][c]==menorValor) {
					
					System.out.print("\nLinha: " + l + " coluna: " + c);
				}
			}
		}
	}

}
