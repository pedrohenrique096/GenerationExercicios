package LacosDeRepeticao;

import java.util.Scanner;

public class while_ex_3 {

    public static void main (String[] args){
        int m21=0,m50=0,num;
        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite sua idade: ");
        num = leia.nextInt();
    while (num > 0){
        if (num < 21){
            m21++;
        } else if (num > 50) {
            m50++;
        }

        System.out.println("\nDigite sua idade: ");
        num = leia.nextInt();

    }


        System.out.println("\nTotal de pessoas menores de 21 anos: " + m21);
        System.out.println("\nTotal de pessoas maiores de 50 anos: " + m50);
    }
}
