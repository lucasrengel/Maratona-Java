package academy.lucas.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("caractere invalido");
                break;
        }

        String sexo = "F";
        switch (sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
