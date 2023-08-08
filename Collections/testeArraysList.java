package Collections;


import java.util.*;

public class testeArraysList {
    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<Integer>();
        minhaLista.add(2);
        minhaLista.add(5);
        minhaLista.add(7);
        minhaLista.add(9);
        minhaLista.add(1);
        minhaLista.add(2);

        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }

        System.out.println("\nRemovendo elemento da lista.");
        System.out.println();

        minhaLista.remove(0);
        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }
        int primeiroElemento = minhaLista.get(0);
        System.out.println("\nO primeiro elemento da lista é: " + primeiroElemento);
        System.out.println();

        for (int i = 0; i < minhaLista.size(); i++) {
            System.out.println("\nElemento: " + minhaLista.get(i));
        }
        Collections.sort(minhaLista);
        System.out.println("\nDepois de ordenado: ");
        System.out.println(minhaLista);
        System.out.println();

        Set<Integer> meuSet = new HashSet<Integer>();

        meuSet.add(9);
        meuSet.add(8);
        meuSet.add(1);
        meuSet.add(5);
        meuSet.add(2);

        Iterator<Integer> iMeuSet = meuSet.iterator();

        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
        }
    }

}
