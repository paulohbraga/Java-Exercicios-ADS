package exercicios;

public class Paralelepipedo {
	
	public static void main(String[] args) throws Exception {
		
		double altura = 0;
		double largura = 0;
		double comprimento = 0;
		double areatotal = 0;
		
		System.out.println("Calculo area do paralelepipedo");
		
		System.out.print("Insira a altura: ");
		altura = Reader.leitor();
		
		System.out.print("Insira a largura: ");
		largura = Reader.leitor();
		
		System.out.print("Insira a comprimento: ");
		comprimento = Reader.leitor();
		
		areatotal = 2 * altura * largura + 2 * largura * comprimento + 2 * altura * comprimento;
		
		System.out.println("A area total do paralelepipedo é: " + areatotal);
		
		
	}

}
