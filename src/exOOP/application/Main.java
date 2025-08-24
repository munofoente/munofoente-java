package exOOP.application;
import exOOP.entities.Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Name: ");
        emp.name = sc.next();
        sc.nextLine();
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();


        System.out.println(emp);

        System.out.println("Percentage to increasse salary: ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println(emp);
        sc.close();
    }
}
