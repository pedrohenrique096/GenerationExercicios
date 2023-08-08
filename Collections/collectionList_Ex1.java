package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionList_Ex1 {
    public static void main (String[]args){
        int op = 0;
        Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList();


            System.out.println("\n\tEscolha 5 cores: ");
            System.out.println();
            System.out.println("\nPrimeira cor: ");
            String c1 = leia.nextLine();
            cores.add(c1);
            System.out.println("\nSegunda cor: ");
            String c2 = leia.nextLine();
            cores.add(c2);
            System.out.println("\nterceira cor: ");
            String c3 = leia.nextLine();
            cores.add(c3);
            System.out.println("\nQuarta cor: ");
            String c4 = leia.nextLine();
            cores.add(c4);
            System.out.println("\nQuinta cor: ");
            String c5 = leia.nextLine();
            cores.add(c5);

            for (int i=0; i<cores.size();i++){
                System.out.println("\n\tLista de cores: ");
                System.out.println("\n "+cores);
            }
            Collections.sort(cores);
            System.out.println("\nCores listadas por ordem crescente: ");
        System.out.println("\n "+cores);





    }
}
