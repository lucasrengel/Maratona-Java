package academy.lucas.maratonajava.javacore.intoducaoclasses.test;

import academy.lucas.maratonajava.javacore.intoducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro up = new Carro();

        up.nome = "Up";
        up.modelo = "Connect Tsi 1.0";
        up.ano = 2020;

        Carro eco = new Carro();

        eco.nome = "Eco Sport";
        eco.modelo = "Turbo 1.6";
        eco.ano = 2017;

        System.out.println("Carro 1: " + up.nome + " " + up.modelo + " " + up.ano);
        System.out.println("Carro 2: " + eco.nome + " " + eco.modelo + " " + eco.ano);
    }
}
