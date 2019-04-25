package exercicios;

public class Triangulo {
    public static void main(String[] args) throws Exception {

    int num = 10;

    for (int i =0 ; i <= num; i++){ // roda num vezes  apenas pulando linha > i = 1 > 2 > 3 > 4 > 5
        for ( int j = 0; j < i; j++ ){ // roda num vezes, exibe asterisco (print exibe lado a lado), e volta pro for externo. j = 1 roda 1 vez, print *, j = 2 roda 2 vez, print **
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
