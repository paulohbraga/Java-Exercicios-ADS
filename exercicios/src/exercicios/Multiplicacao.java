package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiplicacao {
	
	public static void main(String[] args) throws Exception {
		int array1[][] = new int [2][2];
		int array2[][]= new int [2][2];
		int[][] resultado = new int [2][2];
		String leitor;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite a posição [" + i + "," + j + "] do primeiro operando: ");
				leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
				array1[i][j] = Integer.parseInt(leitor);
				System.out.println(array1[i][j]);

				
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite a posição [" + i + "," + j + "] do segundo operando: ");
				leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
				array2[i][j] = Integer.parseInt(leitor);
				
			}
		}
		
		//processamento
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					resultado[i][j] = resultado[i][j] + (array1[i][k] *  array2[k][j]);
				}
			}
		}
		//saida de dados
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(resultado[i][j] + " ");	
			}
			System.out.println("");
		}
	}

}
