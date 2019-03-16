package exercicios;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Celsius{

	public static void main(String[] args) throws Exception {

		double farenheit; 
		double celsius;
		String lertemperatura = ""; 

		System.out.println(" - - - - - - - - - - Celsius to Farenheit - - - - - - - - - - ");
		System.out.print("Insira a temperatura em Celsius: ");
		lertemperatura = (new BufferedReader(new InputStreamReader(System.in))).readLine();

		celsius = Double.parseDouble(lertemperatura);

		farenheit = ((celsius * 1.8) + 32);
		
		System.out.println("Corresponde a " + farenheit + " em Farenheit");
	}

}
