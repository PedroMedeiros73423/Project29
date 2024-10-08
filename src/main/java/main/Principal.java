
package main;

import model.Veiculo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite os quilômetros percorridos: ");
        double kmper = scanner.nextDouble();

        System.out.print("Digite os litros de combustível consumidos: ");
        double litroCom = scanner.nextDouble();

        // Instanciando o objeto da classe Veiculo
        Veiculo veiculo = new Veiculo(kmper, litroCom);

        // Cálculo do consumo
        double consumo = veiculo.calcularConsumo();

        // Saída de dados
        System.out.printf("O consumo do veículo é de: %.2f km/l%n", consumo);

        scanner.close();
    }
}