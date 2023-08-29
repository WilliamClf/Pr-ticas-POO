public class Lampada {
    private String marca;
    private String modelo;
    private double voltagem;
    private double preço;
    private boolean ligar;

    Lampada() {
        this.marca = "";
        this.modelo = "";
        this.voltagem = 0;
        this.preço = 0;
        this.ligar = true;
    }

    String getMarca() {
        return this.marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return this.modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    double getVoltagem() {
        return this.voltagem;
    }

    void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    double getPreço() {
        return this.preço;
    }

    void setPreço(double preço) {
        this.preço = preço;
    }

    void ligar() {
        this.ligar = true;
    }

    void desligar() {
        this.ligar = false;
    }

    void printEstado() {
        if (ligar == true) {
            System.out.println("A lâmpada está Ligada!");
        } else {
            System.out.println("A lâmpada está desligada!");
        }
    }

    void printStatsLampada() {
        System.out.println("*****************************");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Preço: " + preço + "R$");
        printEstado();
    }
}
