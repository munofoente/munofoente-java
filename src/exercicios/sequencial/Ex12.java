package exercicios.sequencial;
import java.util.Scanner;

/*
    12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
    conforme a escolha da forma de pagamento
    pelo comprador e imprima na tela o valor final do produto a ser pago.
 */

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, valorPago, porcentagem;
        int pagamento;

        System.out.print("Insira o valor do produto: ");
        valor = sc.nextDouble();

        System.out.println("Qual forma de pagamento você irá utilizar?: ");
        System.out.println("1 - À vista em Dinheiro ou pix, 15% de desconto -");
        System.out.println("2 - À vista no cartão de crédito, 10% de desconto -");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal sem juros -");
        System.out.println("4 - Parcelado no cartão em três ou mais vezes, juros de 10% -");
        System.out.println();
        System.out.print("Insira o número da forma de pagamento: ");
        pagamento = sc.nextInt();

        switch (pagamento){
            case 1:
                porcentagem = valor * 0.15;
                valorPago = valor - porcentagem;
                System.out.println("Valor a pagar: " + valorPago);
                break;
            case 2:
                porcentagem = valor * 0.10;
                valorPago = valor - porcentagem;
                System.out.println("Valor a pagar: " + valorPago);
                break;
            case 3:
                valorPago = valor / 2;
                System.out.println("Valor a pagar em 2x: " + valorPago);
                break;
            case 4:
                double juros = valor * 0.10;
                valorPago = (valor / 3) + juros;
                System.out.println("Valor a pagar em 3x ou mais: " + valorPago);
                break;
        }

        sc.close();
    }
}
