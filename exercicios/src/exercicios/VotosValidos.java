package exercicios;

import exercicios.Reader;

public class VotosValidos {
	
	
	public static void main(String [] args) throws Exception{
		double cand1 = 0, cand2 = 0, brancos = 0, nulo = 0;
		double validos = 0;
		System.out.print("Votos do primeiro canditado: ");
		cand1 = Reader.leitor();
		System.out.print("Votos do segundo canditado: ");
		cand2 = Reader.leitor();
		System.out.print("Votos brancos: ");
		brancos = Reader.leitor();
		System.out.print("Votos nulos: ");
		nulo = Reader.leitor();
				
		double totalvotos = cand1 + cand2 + brancos + nulo;
				
		validos = (100 * (cand1 + cand2) / totalvotos); 
		
		System.out.println(validos);

	}

}
