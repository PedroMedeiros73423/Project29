package model;

public class Veiculo {
    // Atributos principais
    private double kmper;
    private double litrosCom;

    // Construtor sem parâmetros
    public Veiculo() {
    }

    // Construtor com parâmetros
    public Veiculo(double kmper, double litrosCom) {
        this.kmper = kmper;
        this.litrosCom = litrosCom;
    }

    // Métodos getters e setters
    public double getKmper() {
        return kmper;
    }

    public void setKmper(double kmper) {
        this.kmper = kmper;
    }

    public double getlitrosCom() {
        return litrosCom;
    }

    public void setLitrosCom(double litrosCom) {
        this.litrosCom = litrosCom;
    }

    // Método para calcular o consumo de combustível (km/l)
    public double calcularConsumo() {
        if (litrosCom == 0) {
            return 0; // Evitar divisão por zero
        }
        return kmper / litrosCom;
    }
}
