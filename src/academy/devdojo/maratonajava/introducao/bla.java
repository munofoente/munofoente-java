package academy.devdojo.maratonajava.introducao;

public class bla {
    public static void main(String[] args) {
        String s = null;



        int x = 1;

        x += x++;

        System.out.println(x);

        int[] a = {1, 2, 3};

        System.out.println(a[a.length - 1]);

        int f = 1;

        for (int i = 1; i <= 4; i++) {

            f *= i;

        }

        System.out.println(f);

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) sum += i;

        }

        System.out.println(sum);
    }
}
