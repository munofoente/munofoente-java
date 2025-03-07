package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class AulaTernario {
    public static void main(String[] args) {
        // variável = (condição) ? verdadeiro : falso
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String msgPar = "Par";
        String msgImpar = "Ímpar";

        String resultado = n % 2 == 0 ? msgPar : msgImpar;

        System.out.println(resultado);

        sc.close();
    }
}
