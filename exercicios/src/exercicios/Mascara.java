package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mascara {

	public static void main(String[] args) throws Exception {
		int num = 0;
		String leitor = "";
		do {
			System.out.print("Insira um número de [100 a 180]: ");
			leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
			num = Integer.parseInt(leitor);
		} while((num < 100) || (num > 180));
	}
}
