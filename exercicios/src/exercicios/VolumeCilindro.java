package exercicios;

import exercicios.Volume;

public class VolumeCilindro extends Volume {
	
	public static void main(String[] args) throws Exception {
		Volume vol = new Volume();
		double volume, raio, altura, pi;
		pi = 3.14;

		System.out.print("Insira o raio da base: ");
		raio = vol.reader();
		System.out.print("Insira a altura do cilindro: ");
		altura = vol.reader();
		volume = pi * Math.pow(raio , 2) * altura;
		
		System.out.println(volume);
		
	}

}
