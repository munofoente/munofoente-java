package estudos.matrizes;

import java.util.Scanner;

public class exMatriz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                matrix[rows][columns] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                if(matrix[rows][columns] == x){
                    System.out.println("Position: "+ rows + ", " + columns);
                    if (columns > 0){
                        System.out.println("Left: "+ matrix[rows][columns-1]);
                    }
                    if (rows > 0){
                        System.out.println("Up: "+ matrix[rows-1][columns]);
                    }
                    if (columns < matrix[rows].length-1){
                        System.out.println("Right: "+ matrix[rows][columns+1]);
                    }
                    if (rows < matrix.length-1){
                        System.out.println("Down: "+ matrix[rows+1][columns]);
                    }

                }
            }
        }


        sc.close();
    }
}
