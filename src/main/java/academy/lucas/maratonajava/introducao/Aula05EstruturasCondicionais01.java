package academy.lucas.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado");
        }else{
            System.out.println("Nao Autorizado");
        }

        /*
            idade < 15 categoria infantil
            idade >= 15 && idade < 18 categoria juvenil
            idade >= 18 categoria adulta
         */
        idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade <18) {
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulta";
        }

        //operador ternario

        String resultado = (idade < 15) ? "categoria infantil" : (idade >= 15 && idade < 18)? "Categoria juvenil" : "Categoria Adulta";
        System.out.println(categoria);
        System.out.println(resultado);
    }
}
