package estudos.orientacaoobjetos.calculadora.application;

import estudos.orientacaoobjetos.calculadora.entities.Calculator;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

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
                calc.Sum(a, b);
                result = calc.result;
                System.out.println("=");
                System.out.println(result);
                break;
            case '-':
                calc.Sub(a, b);
                result = calc.result;
                System.out.println("=");
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid character");
        }

        sc.close();
    }
}