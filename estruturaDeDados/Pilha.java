package estruturaDeDados;

import java.util.Iterator;
import java.util.Stack;

public class Pilha
{
    public static void main (String[] args){

        Stack<String> pilha = new Stack<String>();

        pilha.push("Prato preto");//push insere um elemento na pilha
        pilha.push("Prato verde");
        pilha.push("Prato roxo");
        pilha.push("Prato branco");

        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());// Retira o último elemento
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nElemento do topo da pilha: "+pilha.peek());// Mostra o elemento que está no topo, ou seja, o último a ser inserido.
        System.out.println("\nAdicionar um elemento na  pilha: "+pilha.push("prato amarelo"));
        System.out.println("\nElemento da pilha: "+pilha);
        System.out.println("\nTamanho da pilha: "+pilha.size());// Ostra o tamanho de dados armazenados na minha fila.
        System.out.println("\nO elemento prato verde existe na pilha: "+pilha.contains("Prato verde"));//Confere se existe o valor pedido dentro da minha fila.
        System.out.println("\nElemento da pilha atravez do Interator: ");

        Iterator<String> iterator = pilha.iterator();//modifica a saída de dados para o usuário.

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        pilha.clear(); //Limpa a pilha.

        System.out.println("\nA pilha está vazia? "+pilha.isEmpty());

    }
}
