package Atividade1ao8;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o seu gênero (M para masculino, F para feminino): ");
        String genero = scanner.next();

        double pesoIdeal;

        if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (genero.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Gênero inválido.");
            return;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
    }
}

