package LacosDeRepeticao;

import java.util.Scanner;

public class for_ex_2 {

    public static void main (String[] args){

        int par=0 , impar=0 , num;
        Scanner leia = new Scanner(System.in);


        for (int i = num = 0; i <= 10; i++){
            System.out.println("\nDigite um número: ");
            num = leia.nextInt();

            if (num  %2 == 0){
            par++;
            } else {
                impar ++;
            }

        }
        System.out.println("\nTotal de números pares: " + par);
        System.out.println("\nTotal de números ímpares: " + impar);

    }
}
