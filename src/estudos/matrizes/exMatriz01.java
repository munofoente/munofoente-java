package estudos.matrizes;

import java.util.Scanner;

public class exMatriz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        sc.close();
    }
}
