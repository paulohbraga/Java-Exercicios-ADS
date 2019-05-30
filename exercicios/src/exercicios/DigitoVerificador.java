package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitoVerificador {
	
	static int calcular(int numero) {
		int retorno = 0;
		retorno = numero % 10;
		return retorno;
	}
	
	public static void main(String[] args) throws Exception {
		String leitor = "";
		int cpf = 0;
		int digitorverificador = 0;
		
		System.out.print("Insira o CPF: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		cpf = Integer.parseInt(leitor);
		System.out.println(cpf);
		digitorverificador = calcular(cpf);
		
		System.out.println(digitorverificador);
	}
}
