package testeEstagio.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cargaInicial = 50;
        int n = sc.nextInt();

        int[] eventos = new int[n];

        for (int i = 0; i < eventos.length; i++) {
            eventos[i] = sc.nextInt();
        }

        for (int evento : eventos) {
            cargaInicial += evento;

            if (cargaInicial > 100){
                cargaInicial = 100;
            } else if (cargaInicial < 0) {
                cargaInicial = 0;
            }
        }

        System.out.println(cargaInicial);

        sc.close();
    }
}
