package estudos;

public class arrayMulti02 {
    public static void main(String[] args) {
        int[][] array = new int[4][];

        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];

        for (int[] arrayBase: array){
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
