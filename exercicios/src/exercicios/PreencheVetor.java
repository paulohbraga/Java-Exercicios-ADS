package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PreencheVetor {
	public static void main(String[] args) throws Exception {
		int vetor[] = new int[50];
		int numero = -1;
		String leitor;
		
		System.out.print("Insira o tamanho do vetor: ");
		leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
		numero = Integer.parseInt(leitor);
		
		for(int i = 0; i < vetor.length; i++) {
			if (numero == vetor[i]) {
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
