package Atividade1ao8;

import java.util.Scanner;

public class Ex18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = scanner.nextDouble();
        System.out.print("Digite a velocidade da Internet em Mbps: ");
        double velocidadeInternet = scanner.nextDouble();
        scanner.close();

        double tempoSegundos = (tamanhoArquivo * 8) / velocidadeInternet;
        double tempoMinutos = tempoSegundos / 60;
        System.out.printf("O tempo aproximado de download é de %.2f minutos.", tempoMinutos);
    }
}

