package exercicios;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Calculadora {

	public static void main(String[] args) throws Exception {
		
		System.out.println(" - - - - - - - - - - Calculadora - - - - - - - - - - ");
		
		String leitor1 = "";
		String leitor2 = "";

		System.out.print("Insira um número: ");
		leitor1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		System.out.print("Insira outro número: ");
		leitor2 = (new BufferedReader(new InputStreamReader(System.in))).readLine();

		int x = Integer.parseInt(leitor1);
		int y = Integer.parseInt(leitor2);

		System.out.println("Soma: " + (x + y));
		System.out.println("Subtracao: " + (x - y));
		System.out.println("Multiplicação: " + (x * y));
		System.out.println("Divisão: " + (x / y));
		System.out.println("Congruência e módulo: " + (x % y));
		
	}

}
