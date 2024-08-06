package academy.lucas.maratonajava.introducao;

public class Aula08ArrayMulti {
    public static void main(String[] args) {
        //realize a soma de duas matrizes e guarde o resultado em uma terceira matriz
        int[][] m1 = new int[][]{{15, 22, 13}, {4, 1, 6}};
        int[][] m2 = new int[][]{{5, 1, 4}, {13, 21, 12}};
        int[][] m3 = new int[2][3];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
