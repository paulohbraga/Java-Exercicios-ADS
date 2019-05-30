package exercicios;

import java.io.IOException;
public class RealizaEscrita {
	public static void main(String[] args) throws IOException {
		Escrever escrever = new Escrever("File.txt");
		for(int i = 0; i < 100; i++) {
			escrever.escreveTexto("Linha" + ": " + i);
		}

	}
}