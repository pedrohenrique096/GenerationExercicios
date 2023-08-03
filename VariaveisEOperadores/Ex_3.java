package VariaveisEOperadores;

import java.util.Scanner;

public class Ex_3 {

    public static void main (String[] args){
    float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
        Scanner leia = new Scanner(System.in);

        System.out.println("\nInforme o valor Bruto do Salário: ");
        salarioBruto = leia.nextFloat();
        System.out.println("\nInforme o valor do adicional noturno: ");
        adicionalNoturno = leia.nextFloat();
        System.out.println("\nInforme o valor das horas extras: ");
        horasExtras = leia.nextFloat();
        System.out.println("\nInforme o valor dos descontos: ");
        descontos = leia.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;

        System.out.printf("\nO valor do salário líquido é de: %.2f", salarioLiquido);
    }
}
