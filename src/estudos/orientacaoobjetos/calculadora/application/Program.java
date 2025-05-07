package estudos.orientacaoobjetos.calculadora.application;

import estudos.orientacaoobjetos.calculadora.entities.Calculator;


import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a, b, result;
        char op;


        System.out.println("-- Sum and Subtraction Calculator --");
        System.out.println("------------------------------------");
        System.out.print("Enter the first number: ");
        a = sc.nextLong();

        do {
            System.out.print("Choose a operator(+/-): ");
            sc.nextLine();
            op = sc.nextLine().charAt(0);
        } while (op != '+' && op != '-');

        System.out.print("Enter the second number: ");
        b = sc.nextLong();



        switch (op){
            case '+':
                result = Calculator.Sum(a, b);
                System.out.println("=");
                System.out.println(result);
                break;
            case '-':
                result = Calculator.Sub(a, b);
                System.out.println("=");
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid character");
        }

        sc.close();
    }
}