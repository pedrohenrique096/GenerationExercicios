package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_Exc1 {
    public static void main (String[]args){

        int op;
        Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\n\t\t\tMENU:");
            System.out.println("1- Adicionar cliente na fila");
            System.out.println("2- Listar todos os clientes");
            System.out.println("3- Retirar cliente da fila");
            System.out.println("0- Sair");
            System.out.println();
            System.out.println("\nDigite uma opção: ");
            op = leia.nextInt();

            switch (op) {
                case 1:
                leia.nextLine();
                System.out.println("\nDigite o nome a ser adicionado: ");
                String nome = leia.nextLine();
                fila.add(nome);
                System.out.println();
                System.out.println("Cliente ADICIONADO!");
                break;
                case 2:
                if (fila.isEmpty()){
                    System.out.println("A lista está vazia.");
                }else {
                    System.out.println("\nLista de Clientes na Fila: ");
                    Iterator<String> ordem = fila.iterator();
                    while (ordem.hasNext()) {
                        System.out.println(ordem.next());

                    }
                }
                break;
                case 3:
                leia.nextLine();
                System.out.println("\nO cliente "+ fila.poll()+ " foi chamado: ");
                System.out.println(fila);
                break;
            }
        }while (op != 0);
            System.out.println("Programa Finalizado");
        }
    }

