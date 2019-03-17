package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Volume {
	
	public static void message(String mensagem) {
		System.out.print(mensagem);
	}
	
	public static double reader() throws Exception{
		String leitor = "";
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		return Double.parseDouble(leitor);
	}
	
	public static double calcVolume(double altura, double base, double largura) throws Exception{
		return altura * base * largura;
	}
	
	public static void main(String [] args) throws Exception{
		
		double altura, base, largura, volume;
		
		message("------------ Volume do cubo ------------\n");
		
		message("Digite a altura do cubo: ");
		altura = reader();
		
		message("Digite a base do cubo: ");
		base = reader();

		message("Digite a largura do cubo: ");
		largura = reader();
		
		volume = calcVolume(altura, base, largura);
		
		message("O volume é: " + volume);
	}

}
