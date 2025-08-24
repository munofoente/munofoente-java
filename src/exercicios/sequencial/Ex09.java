package exercicios.sequencial;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Insira o peso: ");
        peso = sc.nextDouble();
        System.out.println("Insira a altura: ");
        altura = sc.nextDouble();

        altura /= 100;
        imc = peso / Math.pow(altura, 2);

        System.out.printf("%.2f\n", imc);

        if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau 2");
        } else if(imc >= 40) {
            System.out.println("Obesidade grau 3");
        } else {
            System.out.println("Abaixo do peso");
        }

        sc.close();
    }
}
