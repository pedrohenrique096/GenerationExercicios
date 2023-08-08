package LacosDeRepeticao;

import java.util.Scanner;

public class while_ex_4 {
    public static void main (String[] args) {
        int idade, sexo, cat, masc = 0, femi = 0,
                back = 0, front = 0, mobile = 0, full = 0;
        String continuar = "S";
        Scanner leia = new Scanner(System.in);

        while (!continuar.equalsIgnoreCase("N")) {

            System.out.println("\nDigite sua idade: ");
            idade = leia.nextInt();
            System.out.println("\nSexo: \n1- Masculino\n2- Feminino\n3- Outros");
            sexo = leia.nextInt();



            System.out.println("\nCom qual categoria você trabalha: \n1- Backend \n2- Frontend " +
                    "\n3- Mobile \n4- FullStack");
            cat = leia.nextInt();

            if (cat == 1) {
                back++;
            } else if (sexo==2 && cat == 2){
                front++;
            } else if (sexo == 1 && cat == 3 && idade >40) {
                mobile++;
            }else if (sexo == 2 && cat == 4 && idade < 30){
                full++;
            }
            System.out.println("\nGostaria de cadastrar um novo colaborador? 'S' ou 'N'");
            continuar = leia.next();
        }
        System.out.println("\nO número de pessoas desenvolvedoras Backend: "+ back);
        System.out.println("\nO número de mulheres desenvolvedoras Frontend: " + front);
        System.out.println("\nO número de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
        System.out.println("\nO número de mulheres desenvolvedoras FullStack menores de 30 anos: " + full);
    }
}



