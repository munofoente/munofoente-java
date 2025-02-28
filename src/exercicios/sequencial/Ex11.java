package exercicios.sequencial;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Qual o seu nome?: ");
        nome = sc.nextLine();
        System.out.println("Insira a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Insira a quarta nota: ");
        nota4 = sc.nextDouble();
        media = nota1 + nota2 + nota3 + nota4 / 4;

        if (media >= 7){
            System.out.println("O aluno: " +nome+ " foi aprovado!");
        } else {
            System.out.println("O aluno: " +nome+ " foi reprovado!");
        }

        sc.close();
    }
}
