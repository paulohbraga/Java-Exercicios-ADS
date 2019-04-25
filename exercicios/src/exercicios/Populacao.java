package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Populacao {
    public static void main(String[] args) throws Exception {
        double rendaFamiliar = 0;
        int quantPessoa = 0;
        double media = 0;
        String leitor;

        do{

            System.out.println("Renda familiar");
            leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
            rendaFamiliar += Double.parseDouble(leitor);

            System.out.println("Quantidade de pessoas");
            leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
            quantPessoa += Double.parseDouble(leitor);

            media = rendaFamiliar / quantPessoa;



            System.out.println("Tem mais pessoas? ");

        }while(leitor.equals("s"));

    }
}

