package testeEstagio.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cargaInicial = 50;
        int soma = 0;
        int n = sc.nextInt();

        int[] eventos = new int[n];

        for (int i = 0; i < eventos.length; i++) {
            eventos[i] = sc.nextInt();
            if (i == 0){
                soma = eventos[0] + cargaInicial;
            }
        }


        System.out.println(getBattery(eventos, soma));

        sc.close();
    }

    public static int getBattery(int[] eventos, int soma){
        for (int i = 1; i < eventos.length; i++) {
            soma += eventos[i];
            if (soma > 100){
                soma = 100;
            }
        }
        return soma;
    }
}
