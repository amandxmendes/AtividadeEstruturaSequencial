package Atividade1ao8;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double tamanho = input.nextDouble();

        double litros = tamanho / 3.0;
        int latas = (int) Math.ceil(litros / 18.0);

        double preco = latas * 80.0;

        System.out.println("Quantidade de latas de tinta: " + latas);
        System.out.printf("Preço total: R$ %.2f", preco);

        input.close();
    }

}
