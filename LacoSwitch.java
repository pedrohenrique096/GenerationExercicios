package JavaTech;

import java.util.Scanner;

public class LacoSwitch {
   public static void main (String[] args) {
       int resposta;
       Scanner leia = new Scanner(System.in);
       System.out.println("\n\t\tMenu de elogios");

       System.out.println("\n1- Pessoal incrível");
       System.out.println("\n2- Todos prestativos");
       System.out.println("\n3- Comunicativos");
       System.out.println("\n4- Inteligêntes");

       System.out.println("\nEscolha um elogio para a turma: ");
       resposta = leia.nextInt();

       switch (resposta){
           case 1:
               System.out.println("\nPessoal incrível");
               break;
           case 2:
               System.out.println("\nTodos prestativos");
               break;
           case 3:
               System.out.println("\nComunicativos");
               break;
           case 4:
               System.out.println("\nInteliêntes");
               break;
           default:
               System.out.println("\nOpção Inválida");
       }
   }

}
