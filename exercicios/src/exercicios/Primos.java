package exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primos {
    public static void main(String[] args) throws  Exception {
        // Declaração de variáveis
        int num = 0;
        String leitor;

        // Entrada de dados
        do{
            System.out.print("Digite um número: ");
            leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
            num = Integer.parseInt(leitor);

            //processamento

            if (num % 2 != 0 || num == 2){
                System.out.println(num + " é primo");
            }else{
                System.out.println(num + " nao é primo");
            }

            System.out.println("Deseja checar outro número: ");
            leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();

        }while(leitor.equals("s"));

        System.out.println("Fim do programa");
    }
}
