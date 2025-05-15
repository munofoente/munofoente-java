package estudos.exLista.application;
import estudos.exLista.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");


        int quant = sc.nextInt();
        //o tipo da lista é definido como Funcionario(generics)
        List <Funcionario> lista = new ArrayList<>();

        for (int i = 0; i < quant ; i++) {
            System.out.println("Funcionário #"+ (i+1) );
            System.out.print("ID: ");
            int id = sc.nextInt();
            while(checaId(lista,id)){
                System.out.println("ID já foi cadastrado! Tente denovo.");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            System.out.println();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            lista.add(funcionario);
        }

        System.out.print("Insira o ID do funcionário que receberá aumento: ");
        int idAumento = sc.nextInt();

        //Outra forma de resolver o exercício é com esta expressão lambda:
        //Funcionario f = lista.stream().filter(x -> x.getId() == idAumento).findAny().orElse(null);

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

    //função que verifica se o ID a ser inserido já foi cadastrado
    public static boolean checaId(List<Funcionario> list, int id){
        Funcionario f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return f != null;
    }
}