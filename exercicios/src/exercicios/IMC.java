package exercicios;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class IMC {
	
	
	public static double leitor() throws Exception{
		String leitor;
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();

		return Double.parseDouble(leitor);
		
	}

	public static void main(String[] args) throws Exception {
		double peso, altura, imc;
		System.out.print("Digite o peso: ");
		peso = leitor();
		System.out.print("Digite o altura: ");
		altura = leitor();
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println(String.format("%.2f", imc));
	}

}
