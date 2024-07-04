import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MilkShakespeare - Sistema de Pedidos");
        TelaSystem tela = new TelaSystem();
        frame.setContentPane(tela.getPainelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
