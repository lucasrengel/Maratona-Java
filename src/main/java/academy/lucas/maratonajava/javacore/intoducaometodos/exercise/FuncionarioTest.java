package academy.lucas.maratonajava.javacore.intoducaometodos.exercise;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "lucas";
        f1.idade = 19;
        f1.salarios = new double[]{3000, 2130, 2000};

        f1.imprimirFuncionario();
        f1.mediaSalarios();
    }
}
