public class Imovel {
    private String endereco;
    private double area;
    private int numeroQuartos;
    private int id;

    public Imovel(String endereco, double area, int numeroQuartos, int id) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
    }

    public void reformar() {
        System.out.println("Imóvel em reforma...");
        // Lógica de reforma do imóvel
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
