package exercicios;

import exercicios.Reader;

public class Maioridade {

	public static void main(String[] args) throws Exception {
		double idade;
		
		System.out.println("Checagem de maioridade");
		System.out.print("Digite a idade: ");
		
		
		idade = Reader.leitor(); // Recebe o valor do método leitor na classe Reader.
		
		boolean check =  (idade >= 18) ? true : false; // Ternário
		
		if (check) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor da idade");
		}

	}

}
