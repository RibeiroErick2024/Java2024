import java.util.Queue;

public class Junior {
    private Queue<Milkshake> filaMilkshakes;

    public Junior(Queue<Milkshake> filaMilkshakes) {
        this.filaMilkshakes = filaMilkshakes;
    }

    public void atenderMilkshake() {
        if (!filaMilkshakes.isEmpty()) {
            Milkshake milkshake = filaMilkshakes.poll();
            System.out.println("Junior atendendo milkshake: " + milkshake.getSabor() + ", Tamanho: " + milkshake.getTamanho());
        } else {
            System.out.println("Fila de milkshakes está vazia.");
        }
    }
}
