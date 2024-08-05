package academy.lucas.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 13;
        idades[1] = 53;
        idades[2] = 24;

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

        System.out.println();

        int[] idades2 = new int[]{52, 43 ,32};

        for(int idade : idades2){
            System.out.println(idade);
        }
    }
}
