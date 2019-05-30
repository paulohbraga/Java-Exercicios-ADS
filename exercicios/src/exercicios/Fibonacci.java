package exercicios;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int j = 1;
        while(i < 100){

            i = j + i;
            j = i + j;


            System.out.println(i);
            System.out.println(j);

        }
    }
}
