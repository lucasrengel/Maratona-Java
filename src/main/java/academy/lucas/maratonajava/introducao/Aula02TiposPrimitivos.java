package academy.lucas.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 1000.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 70;
        String nome = "Lucas";

        System.out.println("Idade do pai: " + idade);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome eh: " + nome);
    }
}
