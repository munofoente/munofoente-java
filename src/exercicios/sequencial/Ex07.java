package exercicios.sequencial;

import java.util.Scanner;

/*
    7 - Faça um algoritmo que leia dois valores booleanos
    (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
 */

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x, y;
        System.out.println("Enter the first boolean value: ");
        x = sc.nextBoolean();
        System.out.println("Enter the second boolean value: ");
        y = sc.nextBoolean();

        if(x && y){
            System.out.println("Values are true");
        } else if (!x && !y){
            System.out.println("Values are false");
        }else{
            System.out.println("Values are different");
        }

        sc.close();
    }
}
