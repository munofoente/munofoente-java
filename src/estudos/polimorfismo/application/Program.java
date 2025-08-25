package estudos.polimorfismo.application;

import estudos.polimorfismo.entities.Employee;
import estudos.polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Object> employeeList = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee: #" + i+1 + " data: ");
            System.out.println("Outsourced?(y/n): ");
            char ans = sc.next().charAt(0);
            if (ans == 'n'){
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valPerHour = sc.nextDouble();
                employeeList.add(new Employee(name, hours, valPerHour));
                }
            if (ans == 'y') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valPerHour = sc.nextDouble();
                System.out.println("Additional charge: ");
                double addCharge = sc.nextDouble();
                employeeList.add(new OutsourcedEmployee(name, hours, valPerHour, addCharge));
            }
        }

        System.out.println("PAYMENTS: ");
        for (Object employee : employeeList) {
            System.out.println(employee);
        }

        sc.close();
    }
}
