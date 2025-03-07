package exercicios.sequencial;
import java.util.Scanner;

/*
    14 - Faça um algoritmo que receba um valor A e B,
    e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
 */

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,n;
        System.out.println("Insira dois números: ");
        A = sc.nextInt();
        B = sc.nextInt();

        n = A;
        A = B;
        B = n;

        System.out.println(A);
        System.out.println(B);
        sc.close();
    }
}
