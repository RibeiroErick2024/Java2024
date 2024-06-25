public class Senior extends Funcionario {
    public Senior(String nome) {
        super(nome);
    }

    @Override
    public void atenderPedido(Pedido pedido) {
        if (pedido instanceof Livro) {
            System.out.println("Senior " + nome + " atendendo pedido de Livro: " + ((Livro) pedido).getNome());
        } else if (pedido instanceof Milkshake) {
            System.out.println("Senior " + nome + " atendendo pedido de Milkshake: " + ((Milkshake) pedido).getSabor());
        } else {
            System.out.println("Pedido não reconhecido.");
        }
    }
}
