import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CrudZao {
    private JPanel painelPrincipal;
    private JButton BtnLocalizar;
    private JButton BtnFake;
    private JButton BtnMostrar;
    private JButton BtnApagar;
    private JButton editarButton;
    private JButton BtnCadastrar;
    private JTextField TxtNome;
    private JTextField TxtIdade;
    private JTextField TxtCidade;
    private JTextArea TxtListarProdutos;
    private JLabel nomeLabel;
    private JLabel idadeLabel;
    private JLabel cidadeLabel;

    private ArrayList<Pessoa> listaPessoas;

    public CrudZao() {
        listaPessoas = new ArrayList<>();

        BtnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarPessoa();
            }
        });

        BtnLocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                localizarPessoa();
            }
        });

        BtnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTodos();
            }
        });

        BtnApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apagarPessoa();
            }
        });

        BtnFake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerarRegistrosFakes();
            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarPessoa();
            }
        });
    }

    private void cadastrarPessoa() {
        String nome = TxtNome.getText();
        int idade = Integer.parseInt(TxtIdade.getText());
        String cidade = TxtCidade.getText();

        Pessoa pessoa = new Pessoa(nome, idade, cidade);
        listaPessoas.add(pessoa);

        JOptionPane.showMessageDialog(null, "Pessoa cadastrada !");
        limparCampos();
    }

    private void localizarPessoa() {
        String nomeLocalizar = JOptionPane.showInputDialog("Digite o nome da pessoa:");

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeLocalizar)) {
                TxtNome.setText(pessoa.getNome());
                TxtIdade.setText(String.valueOf(pessoa.getIdade()));
                TxtCidade.setText(pessoa.getCidade());
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    private void mostrarTodos() {
        StringBuilder sb = new StringBuilder();
        for (Pessoa pessoa : listaPessoas) {
            sb.append(pessoa.toString()).append("\n\n");
        }
        TxtListarProdutos.setText(sb.toString());
    }

    private void apagarPessoa() {
        String nomeApagar = JOptionPane.showInputDialog("Digite o nome da pessoa:");

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeApagar)) {
                listaPessoas.remove(pessoa);
                JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso.");
                limparCampos();
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    private void editarPessoa() {
        String nomeEditar = JOptionPane.showInputDialog("Digite o nome da pessoa :");

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeEditar)) {
                pessoa.setNome(TxtNome.getText());
                pessoa.setIdade(Integer.parseInt(TxtIdade.getText()));
                pessoa.setCidade(TxtCidade.getText());

                JOptionPane.showMessageDialog(null, "Pessoa editada com sucesso.");
                limparCampos();
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    private void gerarRegistrosFakes() {
        listaPessoas.add(new Pessoa("João", 30, "São Paulo"));
        listaPessoas.add(new Pessoa("Maria", 25, "Rio de Janeiro"));
        listaPessoas.add(new Pessoa("José", 40, "Curitiba"));

        JOptionPane.showMessageDialog(null, "Registros fakes gerados.");
    }

    private void limparCampos() {
        TxtNome.setText("");
        TxtIdade.setText("");
        TxtCidade.setText("");
    }

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }
}
