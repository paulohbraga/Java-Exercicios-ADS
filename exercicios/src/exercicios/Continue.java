package exercicios;

public class Continue {

	public static void main(String[] args) throws Exception{
		int inicio = 0; int inicioIntervalo = 5; int fimIntervalo = 10; int fim = 20;
		
		while(inicio < fim) {
			if (inicio > 5 && inicio < 10 ) {
				inicio++;
				continue;
			}
			System.out.println("While" + inicio);
			inicio++;
			
		}
	}
}
