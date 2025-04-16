package estudos;

import java.util.Arrays;

public class inserirArray {
    public static void main(String[] args) {
        int[] ints = new int[10];

        int insertIndex = 0;
        int newValue = 12;

        for(int i = ints.length - 1; i > insertIndex; i--){
            ints[i] = ints[i-1];
        }

        ints[insertIndex] = newValue;

        System.out.println(Arrays.toString(ints));
    }
}
