package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tabuada {
	public static void main(String[] args) throws Exception {
		int option;
		String leitor;
		
		
		do {
			System.out.print("Opção 1: Tabuada de Soma\n" +
					           "Opção 2: Tabuada de Subtração\n" +
					           "Opção 3: Tabuada de Multiplicação\n" +
					           "Opção 4: Tabuada de Divisão\n" +
					           "Opção 0 para finalizar\n" +
					           "Digite a opção desejada: ");
			
			leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
			option = Integer.parseInt(leitor);
			
			if (option == 1) {
				System.out.println("Tabuada de Soma : ");
				for (int j = 1; j < 10; j++) {
					for (int i = 1; i < 10; i++) {
						System.out.print(j + " + " + i + ": " + (j + i) + "\t\t");
					}
					System.out.println("\r");
				}
			} else if (option == 2) {
				
				System.out.println("Tabuada de Subtração: ");
				for (int j = 1; j < 10; j++) {
					for (int i = 1; i < 10; i++) {
						System.out.print(j + " - " + i + ": " + (j - i + "\t\t"));
					}
					System.out.println("\r");
				}
			} else if (option == 3) {

				System.out.println("Tabuada de Multiplição: ");
				for (int j = 1; j < 10; j++) {
					for (int i = 1; i < 10; i++) {
						System.out.print(j + " x " + i + ": " + (j * i) + "\t\t");
					}
					System.out.println("\r");
				}
			} else if (option == 4) {

				System.out.println("Tabuada de Divisão: ");
				for (int j = 1; j < 10; j++) {
					for (double i = 1; i < 10; i++) {
						//System.out.print(j + " / " + i + ": " + (j / i) + "\t");
						System.out.printf(j + " ÷ " + (int)i + ": " + "%.1f" + "\t\t", (j / i));
					}
					System.out.println("\r");
				}
			}
		}while (option != 0);
	}

}
