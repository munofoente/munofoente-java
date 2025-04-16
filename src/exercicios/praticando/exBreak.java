package exercicios.praticando;
import java.util.Scanner;

public class exBreak {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valorParcela >= 1000.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preço do carro?: ");
        double valorTotal = sc.nextDouble();

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.printf("Parcela " + parcela + " R$ %.2f \n", valorParcela);


        }
        sc.close();
    }

}