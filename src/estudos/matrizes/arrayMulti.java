package estudos.matrizes;

public class arrayMulti {
    public static void main(String[] args) {
        //criação de um array multidimensional - este é um array de duas dimensões
        int[][] multiArray = new int[2][6];

        for(int i = 0; i < multiArray.length; i++){
            if(i > 0){
                System.out.println("Segundo array: ");
            } else{
                System.out.println("Primeiro array: ");
            }
            for(int j = 0; j < multiArray[i].length; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------");

        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 3;
        arr[1][1] = 2;
        arr[1][2] = 1;

        //foreach com array multidimensional
        for (int[] arrBase : arr){
            int i = 0;
            if (arrBase[i] > 2){
                System.out.println("Segundo array: ");
            } else {
                System.out.println("Primeiro array: ");
            }
            for (int num : arrBase){
                System.out.print(num);
                i++;
            }
            System.out.println();
        }
    }
}
