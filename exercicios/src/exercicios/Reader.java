package exercicios;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Reader {
	
	
	public static double leitor() throws Exception{
		String leitor;
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();

		return Double.parseDouble(leitor);
		
	}
	
}