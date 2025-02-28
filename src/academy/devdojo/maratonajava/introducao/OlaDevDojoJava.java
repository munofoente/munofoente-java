package academy.devdojo.maratonajava.introducao;

public class OlaDevDojoJava {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int n = 0;
               // 1 2 0
        n = a; // 1 2 1
        a = b; // 2 2 1
        b = n; // 2 1 1

        System.out.println(a);
        System.out.println(b);


    }
}
