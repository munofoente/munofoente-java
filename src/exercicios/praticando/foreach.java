package exercicios.praticando;

public class foreach {
    public static void main(String[] args) {
        int[] arr = {4045, 1, 4, 5, 456};

        int max = findMax(arr);

        System.out.println("" + max);
    }

    public static int findMax(int[] n){
        int maximum = n[0];

        for (int n1 : n){
            if(n1 > maximum){
                maximum = n1;
            }
        }
        return maximum;
    }
}
