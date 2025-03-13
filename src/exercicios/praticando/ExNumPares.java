package exercicios.praticando;
import java.util.Scanner;

public class ExNumPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, count;
        count = 0;
        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(i = 0; i < array.length; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }

        System.out.print("Números pares: ");
        for(i = 0; i < array.length; i++){
            if(array[i] % 2 ==0){
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares: " + count);


        sc.close();
    }
}
