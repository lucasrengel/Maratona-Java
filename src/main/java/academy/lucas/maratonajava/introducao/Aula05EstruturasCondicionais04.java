package academy.lucas.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se eh dia util ou final de semana
        // Considerando 1 como Domingo

        byte dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("caractere invalido");
                break;
        }
    }
}
