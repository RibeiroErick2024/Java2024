import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ava extends JFrame {
    private ArrayList<Avaliacao> esquecido = new ArrayList();
    //Avaliacao a = new Avaliacao("Padaria", "Pao", 5, "Pao duro");
    public JPanel painelPrincipal;
    public JTextArea txttexto;
    private JTextField txtestabe;
    private JTextField txtitens;
    private JTextField txtnotas;
    private JTextField txtcomentario;
    private JButton lblGuardar;
    private JButton lblBuscarEstabelecimento;
    private JButton lblBuscarItem;
    private JButton lblMostrar;
    private JButton lblFake;
//Mostrar Tudo
    private void mostrarTudo() {
        String s = "";
        for (Avaliacao e : esquecido) {
            s += String.format("Estabelecimentos: %s \nItens: %s \nNota: %d \nComentários: %s\n---------\n",
                    e.getEstabelecimento(), e.getItens(), e.getNota(), e.getComentario());
        }
        txttexto.setText(s);
    }


    public Ava() {

        Avaliacao restaurante1 = new Avaliacao("Restaurante A", "Pizza", 1, "Não gostei");
        Avaliacao restaurante2 = new Avaliacao("Restaurante B", "Pizza", 9,"Muito boa");
        Avaliacao lanchonete1 = new Avaliacao("Lanchonete C", "Salgado", 9,"Muito bom");
        Avaliacao pizzaria1 = new Avaliacao("Pizzaria D", "Pizza", 9,"Satisfatória");

        esquecido.add(pizzaria1);

        //botãoto fakes
     lblFake.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            esquecido.add(restaurante1);
            esquecido.add(restaurante2);
            esquecido.add(lanchonete1);
            esquecido.add(pizzaria1);
            mostrarTudo();
        }
    });




        lblMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTudo();
            }
        });


        // Guardar
        lblGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtestabe.getText();
                String itens = txtitens.getText();
                String notasText = txtnotas.getText();
                String comentario = txtcomentario.getText();

                int notas = 0;
                try {
                    notas = Integer.parseInt(notasText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Insira um número válido ",
                            "Error 404",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Avaliacao novaProducao = new Avaliacao(nome, itens, notas, comentario);
                esquecido.add(novaProducao);
                JOptionPane.showMessageDialog(null,
                        "Produto: " + txtestabe.getText() +
                                "\nitens:" + txtitens.getText() +
                                "\nnotas:" + txtnotas.getText() +
                                "\ncomentarios:" + txtcomentario.getText());
                txtestabe.setText("");
                txtitens.setText("");
                txtnotas.setText("");
                txtcomentario.setText("");
            }
        });


        //Buscar Estabelecimento
        lblBuscarEstabelecimento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nomeLocalizar = JOptionPane.showInputDialog("Digite o  Estabelecimento:");


                for (Avaliacao produto : esquecido) {
                    if (produto.getEstabelecimento().equalsIgnoreCase(nomeLocalizar)) {
                        JOptionPane.showMessageDialog(null,
                                "Produto :\n" +
                                        "Nome: " + produto.getEstabelecimento() + "\n" +
                                        "Itens: " + produto.getItens() + "\n" +
                                        "Nota: " + produto.getNota());
                        return;
                    }
                }


                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });




        lblBuscarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nomeItem = JOptionPane.showInputDialog("Digite o nome do Item:");


                for (Avaliacao produto : esquecido) {
                    if (produto.getItens().equalsIgnoreCase(nomeItem)) {

                        JOptionPane.showMessageDialog(null,
                                "Produto encontrado:\n" +
                                        "Itens: " + produto.getItens() + "\n" +
                                        "Nome: " + produto.getEstabelecimento() + "\n" +
                                        "Nota: " + produto.getNota());
                        return;
                    }
                }


                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });








    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


