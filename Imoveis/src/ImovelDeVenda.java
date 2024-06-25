public class ImovelDeVenda extends Imovel {
    private double preco;

    public ImovelDeVenda(String endereco, double area, int numeroQuartos, int id, double preco) {
        super(endereco, area, numeroQuartos, id);
        this.preco = preco;
    }

    // Getters e Setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
