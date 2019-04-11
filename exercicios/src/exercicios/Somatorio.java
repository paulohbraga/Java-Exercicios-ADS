package exercicios;

public class Somatorio {
	public static void main(String[] args) throws Exception {
		//Declaração de variáveis
		double resultado = 0;
		
		// Processamento
		for (int x = 0; x < 100; x++) {
			resultado = Math.pow(resultado, 1000) + (x * x * x) + (2 * x * x) + (5 * x);
			
			System.out.println("O resultado do somatório é: " + resultado);
		}
		
		
	}

}
