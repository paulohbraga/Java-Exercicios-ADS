package exercicios;

import exercicios.Reader;

public class SomaDoisMenores {

	public static void main(String[] args) throws Exception {
		double maior = 0, menor1 = 0, menor2 = 0, valor1 = 0, valor2 = 0, valor3 = 0, resultado = 0;
		
		System.out.print("Insira o primeiro valor: ");
		valor1 = Reader.leitor();
		System.out.print("Insira o segunda valor: ");
		valor2 = Reader.leitor();
		System.out.print("Insira o terceiro valor: ");
		valor3 = Reader.leitor();
		
		if (valor1 <= valor2 && valor1 <= valor3) {
			menor1 = valor1;	
				if(valor2 <= valor3 ) {
					menor2 = valor2;
				}
				else {
					menor2 = valor3;
				}
			}
			else if (valor2 <= valor1 && valor2 <= valor3){
			menor1 = valor2;	
				if (valor1 <= valor3) {
					menor2 = valor1;
				}
				else{
					menor2 = valor3;
				}
			}
			else {
			menor1 = valor3;	
			}

		
		resultado = menor1 + menor2;
		System.out.println(resultado);
	}

}
