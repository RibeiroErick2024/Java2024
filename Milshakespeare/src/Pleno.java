public class Pleno extends Funcionario {
    public Pleno(String nome) {
        super(nome);
    }

    @Override
    public void atenderPedido(Pedido pedido) {
        if (pedido instanceof Livro) {
            System.out.println("Pleno " + nome + " atendendo pedido de Livro: " + ((Livro) pedido).getNome());
        } else {
            System.out.println("Pleno " + nome + " não pode atender pedido de Milkshake.");
        }
    }
}
