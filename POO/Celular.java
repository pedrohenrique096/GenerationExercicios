package POO;

public class Celular extends Telefone {
    public Celular(){
        super ("Telefone celular");
    }
    public void toca(int codigoToque){
        switch (codigoToque) {
            case 1:
                System.out.println("\ntrimmmm triiim");
                break;
            case 2:
                System.out.println("\nO Neeeeeymar");
                break;
            default:
                System.out.println("\nAin zé da manga");
        }
    }

    @Override
    public void disca (String numero) {
        System.out.println("\nO número "+numero+" é um celular");

    }
}
