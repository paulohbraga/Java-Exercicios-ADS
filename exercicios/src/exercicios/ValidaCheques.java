package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ValidaCheques {

    public static void main(String[] args) throws  Exception {
        int quantcheques = 0;
        int valorcheques = 0;
        String leitor;
        double valorTotal = 0;
        int contador = 0;


        System.out.println("Qual a quantidade de cheques? ");
        leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
        quantcheques = Integer.parseInt(leitor);

        do{
            System.out.println("Número do cheque: ");
            leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();

            System.out.println("Valor do cheque: ");
            valorcheques +=
            contador += 1;

            System.out.println("Tem mais cheques? ");
            leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();


        } while(leitor.equals("sim"));


    }


}
