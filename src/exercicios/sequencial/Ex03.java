package exercicios.sequencial;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C;

        if(A == B){
            C = A + B;
            System.out.println(C);
        } else{
            C = A * B;
            System.out.println(C);
        }

        sc.close();
    }
}
