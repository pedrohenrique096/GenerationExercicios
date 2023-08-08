package LacosDeRepeticao;

import java.util.Scanner;

public class for_ex_1 {
    public static void main (String[] args){

        int primeiroNum,segundoNum;
        Scanner leia= new Scanner(System.in);

        System.out.println("\t\t\nVamos calcular o intervalo entre dois números que são multiplos de 3 e 15!");

        System.out.println("\nDigite o primeiro número: ");
        primeiroNum = leia.nextInt();
        System.out.println("\nDigite o segundo número: ");
        segundoNum = leia.nextInt();

        if (primeiroNum > segundoNum){
            System.out.println("\nIntervalo inválido!");
            System.exit(0);
        }
        for (int i = primeiroNum; i< segundoNum; i++){
            if (i %3 == 0 && i %5 == 0 ){
                System.out.println(i + " É multiplo 3 e 5.");
            }
        }




        }
    }

