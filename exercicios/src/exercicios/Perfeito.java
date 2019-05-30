package exercicios;

public class Perfeito {

	public static void main(String[] args) throws Exception {
		long num = 6;
		long somadosdivisores = 0;
		
		while(num < 10000) {
			somadosdivisores = 0;

			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					somadosdivisores = somadosdivisores + i;
					System.out.println(i);
				}

				if (somadosdivisores == num) {
					System.out.println(somadosdivisores + " é perfeito >>");
				}
			}

		}
	}
}
