package exercicios.sequencial;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int i, aux;
        int[] array = new int[n];
        System.out.println("Enter three values: ");
        for(i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for(i = 0; i < array.length; i++){ // primeiro loop irá passar pelo array
            for(int j = 0; j < n- 1; j++){ // segundo loop realiza a comparação de cada
                if(array[j] < array[j + 1]){ // um dos elementos do array
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        i++;
        for(i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        sc.close();
    }
}
