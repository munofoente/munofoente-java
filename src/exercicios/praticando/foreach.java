package exercicios.praticando;

public class foreach {
    public static void main(String[] args) {
        int[] arr = {1, 7657, 5, 34445};

        int max = findMax(arr);


        System.out.println("" + max);
    }

    public static int findMax(int[] n){
        int maximum = n[0];

        //este foreach é utilizado somente para percorrer o array
        for (int n1 : n){
            if(n1 > maximum){
                maximum = n1;
            }
        }
        return maximum;
    }
}
