import java.util.Queue;

public class Senior {
    private Queue<Pedido> filaPedidos;
    private Queue<Milkshake> filaMilkshakes;
    private Queue<Livro> filaLivros;

    public Senior(Queue<Pedido> filaPedidos, Queue<Milkshake> filaMilkshakes, Queue<Livro> filaLivros) {
        this.filaPedidos = filaPedidos;
        this.filaMilkshakes = filaMilkshakes;
        this.filaLivros = filaLivros;
    }

    public void atenderProximoPedido() {
        if (!filaPedidos.isEmpty()) {
            Pedido proximoPedido = filaPedidos.poll();
            if (proximoPedido instanceof Milkshake) {
                Milkshake milkshake = (Milkshake) proximoPedido;
                System.out.println("Senior atendendo milkshake: " + milkshake.getSabor() + ", Tamanho: " + milkshake.getTamanho());
            } else if (proximoPedido instanceof Livro) {
                Livro livro = (Livro) proximoPedido;
                System.out.println("Senior atendendo livro: " + livro.getNome());
            }
        } else {
            System.out.println("Fila de pedidos está vazia.");
        }
    }
}
