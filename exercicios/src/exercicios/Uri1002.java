package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1002 {
 
    public static void main(String[] args) throws IOException {
        
        
       double n = 3.14159;
       String leitor = "";
       System.out.println(":");
       leitor = new BufferedReader(new InputStreamReader(System.in)).readLine();
       double R = Double.parseDouble(leitor);
       
       double A = n * R * R;
       
       
       
       System.out.printf("A=%.4f\n" , A );
       
 
    }
}