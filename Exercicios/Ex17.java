package Exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = input.nextDouble();

        double litros = Math.ceil(area / 6.0 * 1.1);
        int latas = (int) Math.ceil(litros / 18.0);
        int galoes = (int) Math.ceil(litros / 3.6);

        double precoLatas = latas * 80.0;
        double precoGaloes = galoes * 25.0;

        int latasMisturadas = (int) (litros / 18.0);
        int galoesMisturados = (int) Math.ceil((litros % 18.0) / 3.6);

        double precoMistura = latasMisturadas * 80.0 + galoesMisturados * 25.0;

        System.out.println("Quantidade de tinta a ser comprada:");
        System.out.println("Apenas latas de 18 litros: " + latas + " latas");
        System.out.println("Preço total: R$ " + precoLatas);
        System.out.println("Apenas galões de 3,6 litros: " + galoes + " galões");
        System.out.println("Preço total: R$ " + precoGaloes);
        System.out.println("Misturando latas e galões:");
        System.out.println(latasMisturadas + " latas e " + galoesMisturados + " galões");
        System.out.println("Preço total: R$ " + precoMistura);

        input.close();
    }
}
