package Atividade1ao8;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
    }
}
