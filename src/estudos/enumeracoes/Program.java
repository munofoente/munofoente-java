package estudos.enumeracoes;

import java.util.Calendar;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String stringDay = sc.next().toUpperCase();
        daysOfTheWeek day = daysOfTheWeek.valueOf(stringDay);
        System.out.println(day.getDayType());

        sc.close();
    }
}
