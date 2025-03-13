package exercicios.praticando;

import java.util.Scanner;

/*
    5 - Faça um algoritmo que leia o valor do salário mínimo e o
    valor do salário de um usuário, calcule quantos salários mínimos esse
    usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
 */

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
