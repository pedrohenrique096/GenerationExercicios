package VariaveisEOperadores;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        float salario,abono,NSalario;
        Scanner leiaSalario = new Scanner(System.in);
        Scanner leiaAbono = new Scanner(System.in);

        System.out.println("\nDigite o Salário: ");
        salario = leiaSalario.nextFloat();

        System.out.println("\nDigite o Abono: ");
        abono = leiaAbono.nextFloat();

        NSalario = salario + abono;

        System.out.printf("\nSeu novo salário é de: %.2f", NSalario );

    }
}