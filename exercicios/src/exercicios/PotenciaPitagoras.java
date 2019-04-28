package exercicios;

public class PotenciaPitagoras {
	public static void main(String[] args) throws Exception {
		int i = 0;
		int contador = 0;
		int somadosimpares = 0;
		int num = 10;
		
		
		while(contador <= num) {

			if(i % 2 == 0) {
				contador++;
			}else {
				System.out.println(i + " é impar");
				somadosimpares = somadosimpares + i;
			}
			i++;
		}
		System.out.println(somadosimpares);

	}
}