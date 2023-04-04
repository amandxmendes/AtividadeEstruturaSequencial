package Atividade1ao8;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);
        double dobroArea = 2 * area;

        System.out.println("A área do quadrado é " + area + " e o dobro da área é " + dobroArea);
    }
}

