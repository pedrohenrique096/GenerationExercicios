package VariaveisEOperadores;

import java.util.Scanner;

public class Ex_4 {
    public static void main (String[] args){

        float n1,n2,n3,n4,diferenca;
        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        n1 = leia.nextFloat();
        System.out.println("\nDigite o segundprimeiro número: ");
        n2 = leia.nextFloat();
        System.out.println("\nDigite o terceiro número: ");
        n3 = leia.nextFloat();
        System.out.println("\nDigite o quarto número: ");
        n4 = leia.nextFloat();

        diferenca = (n1*n2) - (n3*n4);

        System.out.printf("\nDiferença: %.2f", diferenca);

    }   
}
