package estudos.listas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Listas {
    public static void main(String[] args) {
        //declaração da lista deve ser realizada utilizando outra classe para instanciar
        //porque listas são intefaces
        List<String> list = new ArrayList<>();

        list.add("Pedro");
        list.add("Paulo");
        list.add("Judas");
        list.add("Matheus");
        //inserindo um elemento no índice 0, o primeiro item da lista
        list.add(0, "Lucas");


        list.remove(0);

        for(String x : list){
            System.out.println(x);
        }

        System.out.println();
        System.out.print("Tamanho da lista: "+ list.size()+ "\n");
        System.out.print("Índice de Judas: "+ list.indexOf("Judas"));

        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Nova lista:");
        //remove todos os elementos da lista que começam com a letra P
        //isto é uma função lambda predicado
        list.removeIf(x -> x.charAt(0) == 'P');
        for (String x : list){
            System.out.println(x);
        }

        System.out.println();
        System.out.print("Tamanho da lista: "+ list.size()+ "\n");
        System.out.print("Índice de Judas: "+ list.indexOf("Judas")+ "\n");
        System.out.println("-----------------------");
        //exibir somente os elementos que começam com a letra M
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        System.out.println(result);

    }
}
