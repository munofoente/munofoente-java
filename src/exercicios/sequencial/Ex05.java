package exercicios.sequencial;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, minWage, calc;
        System.out.print("Enter the current minimum wage: ");
        minWage = sc.nextDouble();

        System.out.print("Enter your salary: ");
        salary = sc.nextDouble();

        calc = salary / minWage;
        System.out.printf("Your salary is equal to %.0f minimum wage(s)", calc);

        sc.close();
    }
}
