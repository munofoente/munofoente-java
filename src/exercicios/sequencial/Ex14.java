package exercicios.sequencial;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,n;
        n = 0;
        System.out.println("Insira dois números: ");
        A = sc.nextInt();
        B = sc.nextInt();

        n = A;
        A = B;
        B = n;

        System.out.println(A);
        System.out.println(B);
        sc.close();
    }
}
