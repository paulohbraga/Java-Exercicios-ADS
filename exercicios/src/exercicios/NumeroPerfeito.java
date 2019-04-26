package exercicios;

public class NumeroPerfeito {
	
	public static void checaPerfeito(long num) {

		long somadivisores = 0;
		for (long i = 1; i < num; i++) {
			if (num % i == 0) {
				somadivisores = somadivisores + i;
			}
		}
		
		if (somadivisores == num) {
			System.out.println(somadivisores + " é numero perfeito");
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		
		for (long i = 0; i < 100000; i++) {
			checaPerfeito(i);
		}
	}
}
