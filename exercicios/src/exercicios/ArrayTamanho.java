package exercicios;

import java.util.Arrays;

public class ArrayTamanho {
	public static void main(String[] args) throws Exception {
		
		int[] vetor = {1,2,3,4,5};
				
		vetor = Arrays.copyOf(vetor, vetor.length + 1);
		
		for(int i: vetor) {
			System.out.println(i);
		}
		
		Soma somar = new Soma();
		
		double x = somar.soma(1,5);
		System.out.println(x);
	}

}
