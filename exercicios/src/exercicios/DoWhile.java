package exercicios;

public class DoWhile {
	public static void main(String[] args) throws Exception {
		int salario = 0;
		do { // Faça isso....
			System.out.println("Aumentando 100... ");//  o código desse bloco será executado pelo menos uma vez
			salario += 100;
			System.out.println(salario);
		}while(salario < 1000); // ... enquanto isso for falso
		
		System.out.println(salario);
		System.out.println("Alçancou 1000");
	}
}
