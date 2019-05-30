package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matrizes {
	public static void main(String[] args) throws Exception {
		// vars
		String leitor;
		int vetor[] = new int[5];
		
		// input

		for( int i = 0; i < vetor.length; i++) {			
			System.out.print("Digite a posição " + i + ": ");
			leitor =  new BufferedReader(new InputStreamReader(System.in)).readLine();
			vetor[i] =  Integer.parseInt(leitor);
		}
		
		for (int i = vetor.length-1; i >= 0 ; i--) {
			System.out.println(vetor[i]);
		}
		
	}

}
