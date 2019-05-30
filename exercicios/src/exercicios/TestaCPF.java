package exercicios;

public class TestaCPF {
	
	public static void main(String[] args) throws Exception {
		
		VerificaCPF verificaCPF = new VerificaCPF();
		
		
		int[] cpf = {1,1,1,1,1,1,1,1,1,1,1};
		verificaCPF.setCpf(cpf);
		System.out.println(verificaCPF.isValid());
		
	}

}
