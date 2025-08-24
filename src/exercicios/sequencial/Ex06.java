package exercicios.sequencial;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value, readjust;
        System.out.print("Enter a value: ");

        value = sc.nextDouble();
        readjust = value * 0.05;
        value += readjust;

        System.out.println("5% readjust: " + value);

        sc.close();
    }
}
