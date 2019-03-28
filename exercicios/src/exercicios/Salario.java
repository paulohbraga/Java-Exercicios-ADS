package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Salario {
	
	public static void main(String[] args) throws Exception {
		
		double salario = 0;
		int classeint = 0;
			
		System.out.print("Salario: ");
		salario = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine());
			
		System.out.println("1 para gerente");
		System.out.println("2 para supervisor");
		System.out.println("3 para funcionario");
		System.out.println("0 para terminar");
		System.out.print("Digite o numero da classe: ");
			
		classeint = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
			
		while (classeint != 0) {
		
			if (classeint == 1) {
				salario = salario * 1.1;
				System.out.println("Salario: " + salario + "\nFim do programa!");
				break;
			} else if (classeint == 2){
				salario = salario * 1.15;
				System.out.println("Salario: " + salario + "\nFim do programa!");
				break;
			} else if (classeint == 3){
				salario = salario * 1.2;
				System.out.println("Salario: " + salario + "\nFim do programa!");
				break;	
			}			
		}
		System.out.println("Fim do programa");
	}
}
