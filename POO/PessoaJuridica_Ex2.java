package POO;

public class PessoaJuridica_Ex2 extends  POO_Ex1_Cliente{

    private int cnpj;
    private String endereçoF;

    public PessoaJuridica_Ex2(String nome, int idade, String endereco, int telefone, int numConta, int cnpj, String endereçoF) {
        super(nome, idade, endereco, telefone, numConta);
        this.cnpj = cnpj;
        this.endereçoF = endereçoF;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereçoF() {
        return endereçoF;
    }

    public void setEndereçoF(String endereçoF) {
        this.endereçoF = endereçoF;
    }

    public void mostrarPJ(){
        System.out.println("\nO cliente "+getNome()+"\nPortador do CNPJ: "+cnpj+" tem o endereço da empresa em: "+endereçoF);
    }
}
