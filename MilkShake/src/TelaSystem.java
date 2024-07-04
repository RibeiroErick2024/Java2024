import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class TelaSystem extends JFrame {
    private JPanel painelPrincipal;
    private Queue<Pedido> filaPedidos = new LinkedList<>();
    private Queue<Milkshake> filaMilkshakes = new LinkedList<>();
    private Queue<Livro> filaLivros = new LinkedList<>();

    private JButton btnLivro;
    private JButton btnMilk;
    private JTextArea txtMostrar;

    public TelaSystem() {
        btnMilk = new JButton("Pedir Milkshake");
        btnLivro = new JButton("Pedir Livro");
        txtMostrar = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(txtMostrar);

        painelPrincipal = new JPanel();
        painelPrincipal.add(btnMilk);
        painelPrincipal.add(btnLivro);
        painelPrincipal.add(scrollPane);

        btnMilk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 1;
                int numero = 1;
                String tamanho = "Grande";
                String sabor = "Morango";

                Milkshake novoMilk = new Milkshake(id, numero, tamanho, sabor);
                filaPedidos.add(novoMilk);
                filaMilkshakes.add(novoMilk);
                mostrarTudo();

                JOptionPane.showMessageDialog(null,
                        "ID: " + novoMilk.getId() +
                                "\nNúmero: " + novoMilk.getNumero() +
                                "\nTamanho: " + novoMilk.getTamanho() +
                                "\nSabor: " + novoMilk.getSabor(),
                        "Informações do Milkshake",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 2;
                int numero = 2;
                String nome = "Dom Quixote";

                Livro novoLivro = new Livro(id, numero, nome);
                filaPedidos.add(novoLivro);
                filaLivros.add(novoLivro);
                mostrarTudo();

                JOptionPane.showMessageDialog(null,
                        "ID: " + novoLivro.getId() +
                                "\nNúmero: " + novoLivro.getNumero() +
                                "\nNome: " + novoLivro.getNome(),
                        "Informações do Livro",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void mostrarTudo() {
        StringBuilder s = new StringBuilder();
        for (Pedido pedido : filaPedidos) {
            if (pedido instanceof Livro) {
                Livro livro = (Livro) pedido;
                s.append(String.format("Livro:\nID: %d \nNúmero: %d \nNome: %s\n---------\n",
                        livro.getId(), livro.getNumero(), livro.getNome()));
            } else if (pedido instanceof Milkshake) {
                Milkshake milkshake = (Milkshake) pedido;
                s.append(String.format("Milkshake:\nID: %d \nNúmero: %d \nTamanho: %s \nSabor: %s\n---------\n",
                        milkshake.getId(), milkshake.getNumero(), milkshake.getTamanho(), milkshake.getSabor()));
            }
        }
        txtMostrar.setText(s.toString());
    }

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MilkShakespeare - Sistema de Pedidos");
        TelaSystem tela = new TelaSystem();
        frame.setContentPane(tela.getPainelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        tela.initAtendentes();
    }


    private void initAtendentes() {
        Junior junior = new Junior(filaMilkshakes);
        Pleno pleno = new Pleno(filaLivros);
        Senior senior = new Senior(filaPedidos, filaMilkshakes, filaLivros);


        Thread threadJunior = new Thread(() -> {
            while (true) {
                junior.atenderMilkshake();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadJunior.start();

        Thread threadPleno = new Thread(() -> {
            while (true) {
                pleno.atenderLivro();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPleno.start();

        Thread threadSenior = new Thread(() -> {
            while (true) {
                senior.atenderProximoPedido();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadSenior.start();
    }
}
