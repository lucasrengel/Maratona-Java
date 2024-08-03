package academy.lucas.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    /*
        $0 ... $34,712 = 9.70%
        $34,712 ... $68,507 = 37.35%
        $68,507... = 49.50%
     */
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxa;
        if(salarioAnual > 0 && salarioAnual <= 34712){
            taxa = 9.70 / 100;
        }else if(salarioAnual >= 34712 && salarioAnual <= 68507){
            taxa = 37.35 / 100;
        }else{
            taxa = 49.50 / 100;
        }
        salarioAnual *= taxa;
        System.out.println("salario: " + String.format("%.2f", salarioAnual));
    }
}
