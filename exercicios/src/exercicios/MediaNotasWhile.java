package exercicios;

import exercicios.Reader;

public class MediaNotasWhile {

	public static void main(String[] args) throws Exception {

		//Reader leitor = new Reader();
		double media = 0, totalnotas = 0; int numnotas;
		
		System.out.println("- - - - - Calcula Média notas - - - - -");
		
		System.out.print("Quantas notas deseja calcular? ");
		numnotas = (int) Reader.leitor();
		
		int i = 0; // iterador
		while (i < numnotas) {
			System.out.print("Insira a nota: ");
			totalnotas += Reader.leitor();
			System.out.println(totalnotas);
			i++;

		}
		
		media = totalnotas / numnotas;
		
		System.out.println("A média das notas é: " + String.format("%2f", media));
	}

}
