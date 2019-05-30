package exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {
	public File arquivo;
	
	public Escrever(String nome_arquivo) {
		arquivo = new File(nome_arquivo);	
	}
	public void escreveTexto(String texto) throws IOException{
		FileWriter inserindo = new FileWriter(arquivo, true);
		inserindo.write(texto+"\n");
		inserindo.close();
	}
	
}