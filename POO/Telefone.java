package POO;

public abstract class Telefone {

    private String tipo;

    abstract public void toca(int numToques);

    abstract public void disca (String numero);

    public Telefone(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
