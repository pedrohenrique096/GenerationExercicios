package POO;

public class PessoaFisica_Ex2 extends POO_Ex1_Cliente{

    private float cpf;
    private int mei;

    public PessoaFisica_Ex2(String nome, int idade, String endereco, int telefone, int numConta, float cpf, int mei) {
        super(nome, idade, endereco, telefone, numConta);
        this.cpf = cpf;
        this.mei = mei;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getMei() {
        return mei;
    }

    public void setMei(int mei) {
        this.mei = mei;
    }
    public void visualizarPF(){
        System.out.println("\nO cliente "+getNome()+"\nPortador do CPF: "+cpf+"\nPortador do MEI: "+mei);
    }
}
