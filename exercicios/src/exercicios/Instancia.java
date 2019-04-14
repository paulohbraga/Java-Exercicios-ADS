package exercicios;

public class Instancia {
	public static void main(String[] args) throws Exception {
		Mascara mask = new Mascara();
		ChecaTipo checa = new ChecaTipo();
		mask.mai();
		checa.printType(3);

	}
}
