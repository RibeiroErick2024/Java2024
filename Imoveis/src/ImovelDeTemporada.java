public class ImovelDeTemporada extends Imovel {
    private double valorDiaria;

    public ImovelDeTemporada(String endereco, double area, int numeroQuartos, int id, double valorDiaria) {
        super(endereco, area, numeroQuartos, id);
        this.valorDiaria = valorDiaria;
    }

    // Getters e Setters
    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
