package model;

public class Estagiario extends Aluno {
    private String empresa;

    public Estagiario(String nome, int id, String senha, String curso, String empresa) {
        super(nome, id, senha, curso);
        this.empresa = empresa;
    }

    public void iniciarEstagio() {
        System.out.println("Estagiário " + getNome() + " iniciou estágio na empresa " + empresa);
    }


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
