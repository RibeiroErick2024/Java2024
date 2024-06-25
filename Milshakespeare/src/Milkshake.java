public class Milkshake implements Pedido {
    private int id;
    private String tamanho;
    private String sabor;

    public Milkshake(int id, String tamanho, String sabor) {
        this.id = id;
        this.tamanho = tamanho;
        this.sabor = sabor;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
