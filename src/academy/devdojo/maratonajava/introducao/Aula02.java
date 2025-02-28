package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //primitive data types: byte, short, int, long, float, double, boolean, char
        int integer = 2147483647;
        long Long = 9200000000000000000L;
        float numFloat = 787878787848484878f;
        byte numByte = 127;
        short numShort = 32767;
        double numDouble = 8298598558.0;
        boolean value = true;
        boolean falseValue = false;
        char valueChar = 'a';

        integer = (int) 9200000000000000000L;

        //non-primitive data types:
        String name = "Murilo";
        int[] array = {0, 1, 2, 3, 4};
        String[] nomes = {"Murilo", "Pedro", "Gabriel", "Julia"};

        System.out.println(numByte);
        sc.close();
    }
}
