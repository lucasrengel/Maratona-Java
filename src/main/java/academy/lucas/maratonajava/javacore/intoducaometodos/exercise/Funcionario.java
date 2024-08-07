package academy.lucas.maratonajava.javacore.intoducaometodos.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salarios: ");
        for(double salario : salarios){
            System.out.print(salario + " ");
        }
        System.out.println();
    }

    public void mediaSalarios(){
        if(salarios == null){
            return;
        }
        double media = 0;
        for(int i = 0; i < 3; i++){
            media += salarios[i];
        }
        media /= salarios.length;
        System.out.printf("%.2f%n", media);
    }
}
