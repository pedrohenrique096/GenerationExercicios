package POO;

public class AutomovelTeste {
    public static void main (String[]args){
        //instanciando os objetos da classe Automóvel
        Automovel auto1 = new Automovel("Pedro","Hb20s","DXU9166",2023);

        auto1.imprimirInfo();

        auto1.setNomeProprietario("Elise Lages");

        auto1.setPlaca("PED5R00");
        auto1.imprimirInfo();
    }
}
