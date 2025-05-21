package dicas.dica1.model;

public class Student extends Person {

    private String especializacao;
    
    public Student(String nome, int ano_nascimento, String especializacao) {
        super(nome, ano_nascimento);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String toString(){
        return super.toString() + "| Especialização " + especializacao;
    }

}
