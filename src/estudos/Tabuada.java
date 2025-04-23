package estudos;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variáveis
        int num, conta;

        System.out.println("Insira um número para verificar a tabuada do 0 ao 10: ");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            conta = num * i;
            System.out.println(num + " X " +  i + " : " + conta);
        }

        sc.close();
    }
}
