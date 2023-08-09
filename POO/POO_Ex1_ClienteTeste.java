package POO;

public class POO_Ex1_ClienteTeste {
    public static void main (String[]args){

        POO_Ex1_Cliente cliente1 = new POO_Ex1_Cliente("Pedro Henrique",26,"Estrada do sabão",994816659,714899);
        POO_Ex1_Cliente cliente2 = new POO_Ex1_Cliente("Elise Lages",23,"Rua Maria Zélia",994665898,887125);

        cliente1.visualizar();
        cliente2.visualizar();


    }


}
