package academy.lucas.maratonajava.javacore.intoducaometodos.dominio;

public class Calculadora {

    public int soma(int a, int b){
        return a + b;
    }

    public int subtracao(int a, int b){
        return a - b;
    }

    public int multiplica(int a, int b){
        return a * b;
    }

    public double divisao(double a, double b){
        if(b == 0){
            return 0;
        }
        return a / b;
    }
}
