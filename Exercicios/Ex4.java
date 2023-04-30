package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do terceiro bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do quarto bimestre: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é " + media);
    }
}
