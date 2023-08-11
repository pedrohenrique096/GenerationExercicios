package POO;

public class TesteEmpregado {
    public static void main (String[]args){

        Empregado1 pedro = new Empregado1("Pedro Henrique","Rua da marola,33","123456789",99416587,
                26,01,28000,15);

        pedro.imprimirInfo();
        pedro.calcularSalario();
    }
}
