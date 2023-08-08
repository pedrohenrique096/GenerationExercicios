package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    public static void main (String[] args){

        Queue <Integer> fila = new LinkedList<Integer>();

        for (int i=0;i<=10;i++){
            fila.add(i);//adicionando elementos na fila 0
        }
        System.out.println("\nElementos da fila "+fila);
        System.out.println("\nRemovendo elementos da fila: "+fila.remove());
        System.out.println("\nElementos da fila depois de remover:  "+fila);
        System.out.println("\nElementos da fila: "+fila);
        System.out.println("\nAdicionando elementos na fila: "+fila.add(11));
        System.out.println("\nElementos da fila: "+fila);
        System.out.println("\nPrimeiro elementos da fila: "+fila.peek());
        System.out.println("\nPegar o tamanho da fila: "+fila.size());//
        System.out.println("\nVerificar um elementos da fila: "+fila.contains(37));//Retorna true ou False s econtem um elemento da fila
        System.out.println("\nExibir e retirar o primeiro elementos da fila: "+fila.poll());//Exibe e retira o primeiro elemento da lista
        System.out.println("\nElementos da fila: "+fila);

        System.out.println("\nElementos da fila com iterator: ");

        Iterator <Integer> iterator = fila.iterator();//Modifica a saída de dados para o usuário;
            while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nLimpar a fila.");
        fila.clear();
        System.out.println(fila);

        System.out.println("\nMinha fila está vazia? "+fila.isEmpty());



    }
}
