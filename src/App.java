import dicas.dica1.model.Instructor;
import dicas.dica1.model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student estudante = new Student ("Luan", 2006, "ADS");
        Instructor instrutor = new Instructor("Sara", 2006, 10000);

        System.out.println(estudante);
        System.out.println(instrutor);

    }
}
