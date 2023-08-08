package estruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha_Ex1 {
    public static void main (String[]args){

        Stack<String> pilha = new Stack<String>();
        Scanner leia = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n\t\t\tMENU:");
            System.out.println("1- Adicionar livro na pilha.");
            System.out.println("2- Listar todos os livros da pilha.");
            System.out.println("3- Retirar livro da pilha.");
            System.out.println("0- Sair.");
            System.out.println();
            System.out.println("\nDigite uma opção: ");
            op = leia.nextInt();

            switch (op){
                case 1:
                    leia.nextLine();
                    System.out.println("\nQual o nome do livro? ");
                    String livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro ADICIONADO!!");

                    break;
                case 2:
                    if (pilha.isEmpty()){
                        System.out.println("\nA lista está vazia.");
                    }else {
                        System.out.println("\nPilha de Livros: ");
                        Iterator <String> ordem = pilha.iterator();
                        while (ordem.hasNext()){
                            System.out.println(ordem.next());
                        }
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()){
                        System.out.println("\nA pilha está vazia!");
                    }else {
                        System.out.println("\nO livro " + pilha.pop() + " foi retirado da pilha;");
                        Iterator<String> ordem = pilha.iterator();
                        while (ordem.hasNext()) {
                            ordem.next();
                        }
                        System.out.println("\nUm livro foi RETIRADO da lista! ");
                        

                    }
            }

        }while (op != 0);
        System.out.println("\nPrograma finalizado!!" +
                "");


    }
}
