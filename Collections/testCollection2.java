package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class testCollection2 {
    public static void main (String[]args) {

        int op;
        Scanner leia = new Scanner(System.in);

        ArrayList<String> estoque = new ArrayList();

        do {
            System.out.println("\n\tMenu de opções: ");
            System.out.println("-------------------------");
            System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
            System.out.println("\n(2) Deseja remover produtos do estoque?");
            System.out.println("\n(3) Deseja atualizar produtos do estoque?");
            System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
            System.out.println("\n(0) Deseja encerrar o programa?");
            System.out.println("-------------------------");
            System.out.println("\nDigite sua opção!");
            op = leia.nextInt();

            switch (op) {
                case 1:
                    leia.nextLine();
                    System.out.println("\nDigite o produto para adicionar no estoque: ");
                    String produto = leia.nextLine();
                    estoque.add(produto);
                    break;
                case 2:
                    leia.nextLine();
                    System.out.println("\nDigite o produto que deseja remover:");
                    String rProduto = leia.nextLine();
                    if (estoque.contains(rProduto)) {
                        estoque.remove(rProduto);

                    } else {
                        System.out.println("\nProduto não encontrado");
                    }
                    break;
                case 3:
                    leia.nextLine();
                    System.out.println("\nDigite o produto que deseja atualizar: ");
                    String verifica = leia.nextLine();
                    System.out.println("\nDigite o nome do produto que entrará no lugar: ");
                    String novo = leia.nextLine();
                    if (estoque.contains(verifica)) {
                        estoque.remove(verifica);
                        estoque.add(novo);
                    } else {
                        System.out.println("\nProduto não existente!");
                    }
                    break;
                case 4:
                    System.out.println("\nOs produtos que temos em estoque são: ");
                    System.out.println(estoque);
                    break;
                case 0:
                    System.out.println("\nMuito obrigado por utilizar nosso programa, VOLTE SEMPRE! ");
                break;
                default:
                    System.out.println("\nOpção inválida,por favor digite novamente sua opção ");
            }

        } while (op != 0);




    }


}


