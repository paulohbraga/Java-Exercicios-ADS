package exercicios;

public class TestaCPF {
	
	public static void main(String[] args) throws Exception {
		
		VerificaCPF verificaCPF = new VerificaCPF();

		int[] cpf = {0,1,2,3,9,7,3,6,1,9,3};
		verificaCPF.setCpf(cpf);
		System.out.println(verificaCPF.isValid());
			
		

	}

}
