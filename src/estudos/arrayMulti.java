package estudos;

public class arrayMulti {
    public static void main(String[] args) {
        //criação de um array multidimensional - este é um array de duas dimensões
        int[][] multiArray = new int[2][5];

        for(int i = 0; i < multiArray.length; i++){
            if(i > 0){
                System.out.println("Segundo array: ");
            } else{
                System.out.println("Primeiro array: ");
            }
            for(int j = 0; j < multiArray[i].length; j++){
                System.out.println(j);
            }
        }
    }
}
