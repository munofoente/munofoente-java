package estudos.matrizes;

public class arrayMulti02 {
    public static void main(String[] args) {
        //explorando diferentes tipos de inicialização de arrays multidimensionais
        int[][] array = new int[4][];
        int[] array3 = {1, 2, 3};

        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = array3;
        array[3] = new int[] {1,2,3,4};

        int[][] outroArray = {{0,1},{0,1,2},{0,1,2,3}};

        for (int[] arrayBase: array){
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        for (int[] outroArrayBase : outroArray){
            for (int num : outroArrayBase){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
