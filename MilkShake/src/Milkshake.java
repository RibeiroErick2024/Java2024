// Milkshake.java

public class Milkshake extends Pedido {
    private String tamanho;
    private String sabor;

    public Milkshake(int id, int numero, String tamanho, String sabor) {
        super(id, numero);
        this.tamanho = tamanho;
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getSabor() {
        return sabor;
    }
}
