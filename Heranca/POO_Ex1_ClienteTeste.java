package Heranca;

public class POO_Ex1_ClienteTeste {
    public static void main (String[]args){

        POO_Ex1_Cliente cliente1 = new POO_Ex1_Cliente("Pedro Henrique",26,"Estrada do sabão",994816659,714899);
        POO_Ex1_Cliente cliente2 = new POO_Ex1_Cliente("Elise Lages",23,"Rua Maria Zélia",994665898,887125);

        cliente1.visualizar();
        cliente2.visualizar();

        PessoaFisica_Ex2 pessoaFisica = new PessoaFisica_Ex2("Henrique",28,"Rua da Concórdia",39242221,74487,374885155,1444-8);
        PessoaJuridica_Ex2 pessoaJuridica = new PessoaJuridica_Ex2("Aleu Lages",18,"Rua Santa Romana 288",39987553,72214,330000113,"Rua São Leonardo 121");
        pessoaFisica.visualizarPF();
        pessoaJuridica.mostrarPJ();
    }


}
