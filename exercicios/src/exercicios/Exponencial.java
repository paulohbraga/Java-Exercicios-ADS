package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exponencial {
	
	public static void main(String[] args) throws Exception {
		double base = 0;
		double expoente = 0;
		String leitor  = "";
		double resultado = 1;
		System.out.println("Insira a base: ");
		leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
		base = Double.parseDouble(leitor);		
		System.out.println("Insira a expoente: ");
		leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
		expoente = Double.parseDouble(leitor);
		
		for (int i = 1; i <= expoente; i++) {
			resultado = resultado * base ;
			//System.out.println(resultado);
		}
		System.out.println(base + " elevado a " + expoente + "é igual a " + resultado);

		
	}

}
