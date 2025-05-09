package estudos.Pensionato.application;
import estudos.Pensionato.entities.Pensionato;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pensionato[] vect = new Pensionato[10];
        int rooms;

        System.out.print("How many rooms will be rented? ");
        rooms = sc.nextInt();
        int[] rents = new int[rooms];

        for (int i = 0; i < rents.length; i++) {
            System.out.println();
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Pensionato(name, email);
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
                if (vect[i] != null){
                    System.out.println("Busy rooms: " + i + ", " + vect[i]);
                }
        }


        sc.close();

    }
}
