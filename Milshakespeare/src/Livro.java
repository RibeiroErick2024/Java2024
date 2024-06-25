public class Livro implements Pedido {
    private int id;
    private String nome;

    public Livro(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
