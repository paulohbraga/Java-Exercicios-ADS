package exercicios;

public class PositivoOuNegativo {
	
	public static int positivoOuNegativo(int num) {

		int x = num;
		
		if (x < 0) {
			System.out.println("numero negativo");
		}else if (x == 0) {
			System.out.println("igual a 0");
		}else if ( x > 0) {
			System.out.println("numero positivo");
		}
		return x;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		positivoOuNegativo(10);
		
	}

}
