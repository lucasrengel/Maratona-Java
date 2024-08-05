package academy.lucas.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int i = 0;
        while (i < 10) {
            System.out.println(++i);
        }
        i = 0;
        do {
            System.out.println("dentro do do-while");
            i++;
        } while (i < 10);

        //imprima todos os numeros pares de 0 ate 100

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //imprima os 25 primeiros numeros de um valor
        int valorMax = 50;
        for (i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        double valorCarro = 10000;
        int parcela;

        for (parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
