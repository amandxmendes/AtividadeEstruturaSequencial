package Exercicios;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: R$ ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = impostoRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto do IR (11%%): R$ %.2f%n", impostoRenda);
        System.out.printf("Desconto do INSS (8%%): R$ %.2f%n", inss);
        System.out.printf("Desconto do Sindicato (5%%): R$ %.2f%n", sindicato);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        entrada.close();
    }
}

