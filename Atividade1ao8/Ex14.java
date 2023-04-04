package Atividade1ao8;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o peso dos peixes em quilos: ");
        double peso = entrada.nextDouble();

        if (peso > 50.0) {
            double excesso = peso - 50.0;
            double multa = excesso * 4.0;
            System.out.printf("Excesso de peso: %.2f kg\n", excesso);
            System.out.printf("Valor da multa: R$ %.2f\n", multa);
        } else {
            System.out.println("Não houve excesso de peso.");
        }

        entrada.close();
    }
}

