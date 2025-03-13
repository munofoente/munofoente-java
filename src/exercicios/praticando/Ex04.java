package exercicios.praticando;

import java.util.Scanner;

/*
    4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 */

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, predecessor, successor;
        System.out.println("Enter a integer number: ");
        num = sc.nextInt();
        predecessor = num - 1;
        successor = num + 1;

        System.out.println("Predecessor: " + predecessor);
        System.out.println("Successor: " + successor);

        sc.close();
    }
}
