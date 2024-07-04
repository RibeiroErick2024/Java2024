public class Livro extends Pedido {
    private String nome;

    public Livro(int id, int numero, String nome) {
        super(id, numero);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
