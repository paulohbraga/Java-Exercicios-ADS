package exercicios;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class HoraParaSegundos {

	public static void main(String[] args) throws Exception {
		double hora;
		double segundos;
		String leitor = "";
		
		System.out.println("--------- Converter horas para minutos ---------");
		System.out.print("Digite a quantidade de horas: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		hora = Double.parseDouble(leitor);
		
		segundos = hora * 60 * 60;
		
		System.out.println(hora + " hora(s) tem " + segundos + " segundos");
	}

}
