import java.util.Queue;

public class Pleno {
    private Queue<Livro> filaLivros;

    public Pleno(Queue<Livro> filaLivros) {
        this.filaLivros = filaLivros;
    }

    public void atenderLivro() {
        if (!filaLivros.isEmpty()) {
            Livro livro = filaLivros.poll();
            System.out.println("Pleno atendendo livro: " + livro.getNome());
        } else {
            System.out.println("Fila de livros está vazia.");
        }
    }
}
