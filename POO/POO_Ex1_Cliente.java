package POO;

public class POO_Ex1_Cliente {

    private String nome;
    private int idade;
    private String endereco;
    private int telefone;
    private int numConta;

    public POO_Ex1_Cliente(String nome, int idade, String endereco, int telefone, int numConta) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void visualizar(){
        System.out.println("\nCliente(a) "+nome+" \nIdade: "+idade+ " \nResidente na: "+endereco+ " \nportador do telefone (11) "+ telefone+ " \nNúmero da conta: "+numConta);
    }
}
