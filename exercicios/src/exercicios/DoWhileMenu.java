package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoWhileMenu {
	public static void main(String[] args) throws Exception {
		int option;
		double num = 0;
		String leitor = "";
		
		
		do {
			System.out.println("Opção 1: Tabuada de Soma");
			System.out.println("Opção 2: Tabuada de Subtração");
			System.out.println("Opção 3: Tabuada de Multiplicação");
			System.out.println("Opção 4: Tabuada de Divisão");
			System.out.println("Opção 0 para finalizar");
			
			System.out.print("Digite a opção desejada: ");
			leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
			option = Integer.parseInt(leitor);
			
			if (option == 1) {
				System.out.println("Tabuada de Soma : ");
				for (int j = 0; j < 10; j++) {
					for (int i = 1; i < 10; i++) {
						System.out.println(j + " + " + i + ": " + (j + i));
					}
					System.out.println("\r");
				}
			} else if (option == 2) {
				
				System.out.println("Tabuada de Subtração: ");
				for (int j = 0; j < 10; j++) {
					for (int i = 1; i < 10; i++) {
						System.out.println(j + " - " + i + ": " + (j - i));
					}
					System.out.println("\r");
				}
			}
			
			//////////// alterar a logica acima
			
		}while (option != 0);
	}

}
