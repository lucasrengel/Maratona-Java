package academy.lucas.maratonajava.javacore.intoducaometodos.test;

import academy.lucas.maratonajava.javacore.intoducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calcudora = new Calculadora();
        System.out.println("Resultado da soma: " + calcudora.soma(10, 10));
        System.out.println("Resultado da subtracao: " + calcudora.subtracao(10, 20));
        System.out.println("Resultado da multiplicacao: "+calcudora.multiplica(10, 20));
        System.out.println("Resultado da divisao: " + calcudora.divisao(42, 10));
    }
}
