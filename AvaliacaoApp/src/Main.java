import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ava i = new Ava();
        i.setContentPane(i.painelPrincipal);
        i.setTitle("Simulador");
        i.setSize(800,700);
        i.setVisible(true);
        i.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}