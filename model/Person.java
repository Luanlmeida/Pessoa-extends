package dicas.dica1.model;

public class Person {

    private String nome;
    private int ano_nascimento;

    public Person(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String toString(){
        return "Nome: " + nome + "| Ano nascimento: " + ano_nascimento;
    }

}
