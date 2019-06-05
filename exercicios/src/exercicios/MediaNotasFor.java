package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MediaNotasFor {
	
	
	public static void main(String[] args) throws Exception {
		int abaixo = 0;
		int acima = 0;
		int soma = 0;
		int total_alunos = 0;
		int[] nota = new int[20];
		
		System.out.print("Quantidade de alunos: ");
		total_alunos = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		for (int i = 1; i <= total_alunos; i++) {
			nota[i] = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			soma = soma + nota[i];
			
		}
		int media = soma / total_alunos;
		
		for (int i = 1; i <= total_alunos; i++) {
			if (nota[i] > media) {
				acima = acima + 1;
			}else if (nota[i] < 5){
					abaixo = abaixo + 1;
			}
		}
		System.out.println("Media da turma foi: " + media);
		System.out.println("Quantidade de alunos acima da média: " + acima);
		System.out.println("Quantidade de alunos com nota inferior a 5: " + abaixo);
		
	}
	
	

}
