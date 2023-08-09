package POO;

import java.text.NumberFormat;
//Declaração dos atributos das classes
public class Empregado {

    private String nome;
    private double salario;

    //Declaração do construtor da classe
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        salario *= 1 + percentual/100;
    }
    public String formatarMoeda(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();//método para pegar a moeda do país.
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(salario);//método para formatar o salário.
        return formatoMoeda;

    }
    public void imprimir(){
        System.out.println(nome+ " "+"Salário: "+this.formatarMoeda());
    }



}
