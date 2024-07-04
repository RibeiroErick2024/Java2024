import java.util.LinkedList;
import java.util.Queue;


public class AtendimentoMain {
    public static void main(String[] args) {
        Queue<Pedido> filaPedidos = new LinkedList<>();
        Queue<Milkshake> filaMilkshakes = new LinkedList<>();
        Queue<Livro> filaLivros = new LinkedList<>();


        filaMilkshakes.add(new Milkshake(1, 1, "Grande", "Morango"));
        filaLivros.add(new Livro(2, 1, "Dom Quixote"));
        filaMilkshakes.add(new Milkshake(3, 2, "Médio", "Chocolate"));

        Junior junior = new Junior(filaMilkshakes);
        Pleno pleno = new Pleno(filaLivros);
        Senior senior = new Senior(filaPedidos, filaMilkshakes, filaLivros);


        junior.atenderMilkshake();
        pleno.atenderLivro();
        senior.atenderProximoPedido();
    }
}
