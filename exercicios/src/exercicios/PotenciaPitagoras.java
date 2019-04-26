package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PotenciaPitagoras {
	public static void main(String[] args) throws Exception {
		int num = 0;
		int contador = 0;
		int quadrado = 0;
		String leitor;
		System.out.println("Calculo do quadrado de n - Pitágoras\nÉ a soma dos numeros anteriores impares");
		System.out.print("Insira o número que deseja calcular: ");
		leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
		num = Integer.parseInt(leitor);
		
		while (contador < num + num) {
			if (contador % 2 != 0) {
				quadrado += contador;

			}
			contador++;
		}
		System.out.println(quadrado);
	}
}





















//		for (int i = 1; i <= num + num; i++) {
//			if (i % 2 != 0) {
//				contador = contador + i;
//			}
//		}