package exercicios;


public class MediaNotas {

	public static void main(String[] args) throws Exception {
		double nota1 = 0, nota2 = 0, nota3 = 0, media = 0 ;
		
		System.out.println("- - - - - Calcula Média notas - - - - -");
		
		System.out.print("Insira a primeira nota: ");
		nota1 = Reader.leitor();
		System.out.print("Insira a segunda nota: ");
		nota2 = Reader.leitor();
		System.out.print("Insira a terceira nota: ");
		nota3 = Reader.leitor();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média das notas é: " + String.format("%2f", media));
	}

}
