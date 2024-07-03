import model.Aluno;
import model.Estagiario;
import model.Pessoa;

public class Main {
    public static void Main(String[] args) {

        Aluno aluno = new Aluno("João", 1001, "senha123", "Ciência da Computação");
        aluno.fazerMatricula();
        aluno.mudarSenha("novaSenha123");


        Estagiario estagiario = new Estagiario("Maria", 2001, "senha456", "Engenharia", "Empresa X");
        estagiario.fazerMatricula();
        estagiario.iniciarEstagio();
        estagiario.mudarSenha("outraNovaSenha456");
    }
}
