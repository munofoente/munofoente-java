package estudos.classesabstratas.ex02.application;

import estudos.classesabstratas.ex02.entities.Company;
import estudos.classesabstratas.ex02.entities.Individual;
import estudos.classesabstratas.ex02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> payerList = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company? (i/c): ");
            char ans = sc.next().charAt(0);
            if (ans == 'i'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Annual income: ");
                double income = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthCare = sc.nextDouble();
                payerList.add(new Individual(name, income, healthCare));
            }
            if (ans == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Annual income: ");
                double income = sc.nextDouble();
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                payerList.add(new Company(name, income, employees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");
        for (TaxPayer list : payerList){
            System.out.println(list);
        }

        System.out.println();

        System.out.print("TOTAL TAXES: $ ");
        double sum = 0.0;
        for (TaxPayer list : payerList){
            sum = sum + list.taxes();
        }
        System.out.println(sum);

        sc.close();
    }
}
