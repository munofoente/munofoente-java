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
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println();

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i]+ " ");
        }

        System.out.println();

        System.out.println("Números Negativos");
        int negativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0){
                    negativos++;
                }
            }
        }
        System.out.println(negativos);


        sc.close();
    }
}
