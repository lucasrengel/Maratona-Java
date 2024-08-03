package academy.lucas.maratonajava.introducao;
/*
    Pratica

    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereco <endereco>,
    confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Joao Candido da Rosa 111";
        double salario = 1000;
        String data = "01/08/2024";
        String mensagem = "Eu " + nome + ", morando no endereco " + endereco +
                ", confirmo que recebi o salario de " + String.format("%.2f", salario) + ", na data " + data;

        System.out.println(mensagem);
    }
}
