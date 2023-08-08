package LacosDeRepeticao;

import java.util.Scanner;

public class DoWhile_ex_6 {
    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);
        int num =0, media =0,soma = 0;

        do {
            System.out.println("\nDigite um número: ");
            num = leia.nextInt();
            if (num % 3 == 0){
                soma += num;
                media++;
            }


        }while (num != 0);
        System.out.println("\nA média dos números multiplos de três é: "+soma/media);
    }
}
