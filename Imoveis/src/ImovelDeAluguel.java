public class ImovelDeAluguel extends Imovel {
    private double valorDoAluguel;
    private boolean disponibilidade; // true se disponível, false se alugado

    public ImovelDeAluguel(String endereco, double area, int numeroQuartos, int id, double valorDoAluguel) {
        super(endereco, area, numeroQuartos, id);
        this.valorDoAluguel = valorDoAluguel;
        this.disponibilidade = true; // novo imóvel sempre está disponível
    }

    public void alugar() {
        if (disponibilidade) {
            System.out.println("Imóvel alugado com sucesso por R$" + valorDoAluguel);
            disponibilidade = false; // marca como alugado
        } else {
            System.out.println("Imóvel não está disponível para aluguel.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            System.out.println("Imóvel devolvido.");
            disponibilidade = true; // marca como disponível
        } else {
            System.out.println("Imóvel já está disponível para aluguel.");
        }
    }

    // Getters e Setters
    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
