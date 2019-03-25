package exercicios;

public class EquacaoSegundo {
	public static void main(String[] args) throws Exception{
		double a = 1, b = -2, c = -3;
		double x1, x2;
		double delta;
		double quadrado = 2;
		
		
		delta = Math.pow(b, quadrado) - 4*(a*c);
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		if (delta < 0) {
			System.out.println("Sem raizes reais");
		}else if (delta > 0) {
			System.out.println("Delta positivo, possui 2 raizes");
		}
		
		System.out.println("Delta: " + delta);
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		
	}

}
