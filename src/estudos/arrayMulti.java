package estudos;

public class arrayMulti {
    public static void main(String[] args) {
        //criação de um array multidimensional - este é um array de duas dimensões
        int[][] multiArray = new int[2][5];

        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length;j++){
                System.out.println("i:" + i + " j:" + j);
            }
        }
    }
}
