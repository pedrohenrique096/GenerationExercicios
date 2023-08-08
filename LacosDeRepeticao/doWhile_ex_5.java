package LacosDeRepeticao;

import java.util.Scanner;

public class doWhile_ex_5 {
    public static void main(String[] args) {

        int num, soma=0;
        Scanner leia = new Scanner(System.in);



        do {
            System.out.println("Digite um número: ");
            num = leia.nextInt();
            if (num > 0){

                soma += num;
            }
        } while (num != 0);

        System.out.println("\nA soma dos números positivos é: " + soma);
    }



}
