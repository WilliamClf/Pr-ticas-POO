//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,desligar a lâmpada.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a marca da lâmpada: ");
        String marca = sc.nextLine();

        System.out.println("Insira o modelo da lâmpada: ");
        String modelo = sc.nextLine();

        System.out.println("Insira a voltagem da lâmpada: ");
        double voltagem = sc.nextDouble();

        System.out.println("Insira o preço da lâmpada: ");
        double preço = sc.nextDouble();

        lp.desligar();
        lp.setMarca(marca);
        lp.setModelo(modelo);
        lp.setVoltagem(voltagem);
        lp.setPreço(preço);
        lp.printStatsLampada();
    }

}
