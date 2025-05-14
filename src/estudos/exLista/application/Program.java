package estudos.exLista.application;
import estudos.exLista.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");

        Funcionario funcionario = new Funcionario();
        int quant = sc.nextInt();
        List <Funcionario> lista = new ArrayList<>(quant);

        for (int i = 0; i < quant ; i++) {
            System.out.println("Funcionário #"+ (i+1) );
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            System.out.println();
            funcionario = new Funcionario(id, nome, salario);
            lista.add(funcionario);
        }

        System.out.print("Insira o ID do funcionário que receberá aumento: ");
        int idAumento = sc.nextInt();

        //aqui é criada uma variável posicao para receber a função
        Integer posicao = posicao(lista, idAumento);
        if (posicao == null){
            System.out.println("Este id não existe!!");
        } else {
            System.out.print("Insira a porcentagem: ");
            double porcentagem = sc.nextDouble();
            lista.get(posicao).aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for(Funcionario x : lista){
            System.out.println(x);
        }
        sc.close();
    }


    //função que existe para percorrer a lista e procurar a posição do ID inserido
    public static Integer posicao(List<Funcionario> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        //caso o loop for não retorne nada, a função retorna nulo
        return null;
    }
}
