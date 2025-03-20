package exercicios.praticando;
import java.util.Scanner;

public class variacaoParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num %= 2;

        if(num == 0){
            System.out.println("Par");
        } else{
            System.out.println("Ímpar");
        }

        sc.close();
    }
}
