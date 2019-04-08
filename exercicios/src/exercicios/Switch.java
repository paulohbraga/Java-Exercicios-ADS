package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch {
	public static void main(String[] args) throws Exception {
		String leitor = null;
		// System.out.println(leitor.length()); // return a NullPointerException
		System.out.print("Insert a number: ");
		leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
		//System.out.println(leitor.length()); // return a string size
		
		switch (Integer.parseInt(leitor)) {
			case 1: 
				System.out.println(leitor);
				break; // without a break the other cases run. The break stops the switch block.
			case 2:
				System.out.println(leitor);
				break;
			case 3:
				System.out.println(leitor);
				break;
			default:
				System.out.print("Not 1,2 or 3, is: " + leitor);
		}
			
	}

}
