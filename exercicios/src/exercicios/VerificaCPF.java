package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerificaCPF {
	
	private int[] cpf = new int[11];
	private int[] cpf2 = new int[9];
	private int[] cpf3 = new int[10];
	private String leitor = "";

	public int[] getCpf() {
		return cpf;
	}
	
	public void setCpf(int[] cpf) {
		this.cpf = cpf;
	}
	
	public int[] lerCpf() throws IOException {
		for (int i = 0; i < cpf.length; i++) {
			System.out.print("Digite o caractere " + (i+1) + ":");
			leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
			cpf[i] = Integer.parseInt(leitor);
		}
		return cpf;
	}
	
	public int primeiroDigito(int[] cpf) {
		
		for (int i = 0, j = 10; i < cpf.length-2 && j > 0; i++, j--) {
			cpf2[i] = cpf[i] * j;
		}
		
		int soma = 0;
		int resto = 0;
		
		for (int i = 0 ; i < cpf2.length; i++) {
			soma += cpf2[i];
		}
		resto = soma % 11;
		int resultado = 11 - resto;
		
		if (resultado > 9) {
			return 0;
		}else {
			return resultado;
		}

	}
	
	public int segundoDigito(int[] cpf) {
		
		for (int i = 0, j = 11; i < cpf.length-1 && j > 0; i++, j--) {
			cpf3[i] = cpf[i] * j;
		}
		
		int soma = 0;
		int resto = 0;
		
		for (int i = 0 ; i < cpf3.length; i++) {
			soma += cpf3[i];
		}
		resto = soma % 11;
		int resultado = 11 - resto;
		if (resultado > 9) {
			return 0;
		}else {
			return resultado;
		}
	}
	
	public boolean isValid() {
		if (primeiroDigito(cpf) == cpf[9] && segundoDigito(cpf) == cpf[10]) {
			System.out.println("CPF válido");
			return true;
			
		}else {
			System.out.println("CPF inválido");
			return false;
		}
	}
	
}
