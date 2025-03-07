package exercicios.sequencial;
import java.util.Scanner;

/*
    2 - Faça um algoritmo
    para receber um número qualquer e
    imprimir na tela se o número é par ou ímpar, positivo ou negativo.
 */

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

        if(num < 0){
            System.out.println("Negative");
        } else{
            System.out.println("Positive");
        }

        sc.close();
    }
}
