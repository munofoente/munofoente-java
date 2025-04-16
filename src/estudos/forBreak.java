package estudos;

public class forBreak {
    //imprimir os 25 primeiros valores de um dado específico.
    // Um exemplo, max vale 50, imprimir somente do 0 ao 25
    public static void main(String[] args) {
        int max = 50;
        for (int i = 0; i <= max; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
