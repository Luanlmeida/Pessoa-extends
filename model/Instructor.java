package dicas.dica1.model;

public class Instructor extends Person {

    private double salario;

    public Instructor(String nome, int ano_nascimento, double salario) {
        super(nome, ano_nascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return super.toString() + "| Salário: R$" + salario;
    }
}
