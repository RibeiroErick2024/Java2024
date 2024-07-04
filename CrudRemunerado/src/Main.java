import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CrudZao Form");
        CrudZao crudZao = new CrudZao();
        frame.setContentPane(crudZao.getPainelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
