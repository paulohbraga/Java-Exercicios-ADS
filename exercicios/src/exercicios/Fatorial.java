package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fatorial {
	
	public static void main(String[] args) throws Exception {
		double num = 0;
		double resultado = 1;
		
		String leitor = "";
		System.out.print("Insira um número para calcular o fatorial: ");
		leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
		num = Integer.parseInt(leitor);
		
		for (int i = 1; i <= num; i++) {
			resultado = resultado * i;
		}
		System.out.println(resultado);
		
	}

}
