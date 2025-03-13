package exercicios.praticando;
import java.util.Scanner;

public class ExSomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores cada vetor terá? ");
        int n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Vetor Resultante: ");
        int[] vetorC = new int[n];
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}
