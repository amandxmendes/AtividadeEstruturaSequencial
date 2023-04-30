package Exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês? ");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário neste mês será de R$ " + salario);
    }
}

