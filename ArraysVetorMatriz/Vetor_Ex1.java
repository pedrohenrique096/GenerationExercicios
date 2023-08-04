package ArraysVetorMatriz;

import java.util.Scanner;

    public class Vetor_Ex1 {

    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        float x;
        int n=0;
        int [] num = {20,12,23,34,45,56,67,78,89,10};

        System.out.println("\nEscolha um número: ");
        x = leia.nextFloat();
        for (int i=0; i<10 ; i++){
            if (num[i] == x){
                System.out.println("\nO número está localizado na posição: " + i);
            } else {
                n ++;
            }
            }
            if (n == 10){
                System.out.println("\nO número não foi encontrado.");
            }

        }



}
