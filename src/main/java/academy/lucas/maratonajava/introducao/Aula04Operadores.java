package academy.lucas.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10, n2 = 20;
        double resultado = n1 / (double)n2;
        System.out.println("valor " + resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

        // && (AND) || (OR) !
        int idade = 29;
        float salario = 3500;
        boolean isDentroDaLeiMaior = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenor = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaior " + isDentroDaLeiMaior);
        System.out.println("isDentroDaLeiMenor " + isDentroDaLeiMenor);

        double valorTotalConta = 200;
        double valorTotalPoupanca = 5000;
        float valorPlaystation = 3000;
        boolean isPlaystationCincoCompravel = valorTotalConta > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel" + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 3;
        contador += 1; //4
        contador++; //5
        contador--; //4
        ++contador; //7
        --contador; //4
        System.out.println(contador);

    }
}
