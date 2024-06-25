public class Junior extends Funcionario {
    public Junior(String nome) {
        super(nome);
    }

    @Override
    public void atenderPedido(Pedido pedido) {
        if (pedido instanceof Milkshake) {
            System.out.println("Junior " + nome + " atendendo pedido de Milkshake: " + ((Milkshake) pedido).getSabor());
        } else {
            System.out.println("Junior " + nome + " não pode atender pedido de Livro.");
        }
    }
}
