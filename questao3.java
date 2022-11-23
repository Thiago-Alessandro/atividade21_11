package atividade21_11;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		int m[][] = new int [5][5];
		int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0,somaDiagonalSecundaria = 0, somaTodosElementos = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 5;c++) {
			
			for(int l = 0;l< 5;l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				m[l][c] = teclado.nextInt();
				
				somaTodosElementos+=m[l][c];
				
				if(l==c) {
					
					somaDiagonalPrincipal += m[l][c];
				}
				if (l+c==4) {
					
					somaDiagonalSecundaria += m[l][c];
				}
				if(l==3) {
					
					somaLinha4 += m[l][c];
				}
				if (c == 1) {
					
					somaColuna2 += m[l][c];
				}
			}
		}
		System.out.print("\n\nA soma da diagonal principal é: " + somaDiagonalPrincipal);
		System.out.print("\nA soma da diagonal secundária é: " + somaDiagonalSecundaria);
		
		System.out.print("\n\nA soma da linha 3 é: " + somaLinha4);
		System.out.print("\nA soma da coluna 1 é: " + somaColuna2);
		
		System.out.print("\n\nA soma de todos elementos é: " + somaTodosElementos);

		for (int c = 0;c < 5;c++) {
			
			for(int l = 0;l< 5;l++) {
				
				System.out.print("\nO valor da linha: " + l + " coluna: " + c + " é: " + m[l][c]);
			}
		}
		
	}

}
