package exercicios;

//Variaveis de instância e variáveis de classe

public class Quadrado {
	
	public String cor  = "Azul"; // variavel de instância: pertence exclusivamente a instância criada com new.
	public static String fundo = "Vermelho"; // variavel de classe: static torna a variavel pertencente a classe. s
	
	public static void main(String[] args) throws Exception {
		
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		
		q1.cor = "Verde";
		q2.cor = "Verde";

		System.out.println("Objeto q1: " + q1.cor);
		System.out.println("Objeto q2: " + q2.cor);
		
		q1.fundo = "Laranja";
		
		System.out.println("Objeto q1 fundo: " + q1.fundo);
		System.out.println("Objeto q2 fundo: " + q2.fundo);
		
		
	}
}
