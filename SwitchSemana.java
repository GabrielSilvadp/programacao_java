package _18_logica_5_6;

import java.util.Scanner;

public class SwitchSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        Integer dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("O dia que você escolheu é: Domingo");
                break;
            case 2:
                System.out.println("O dia que você escolheu é: Segunda-Feira");
                break;
            case 3:
                System.out.println("O dia que você escolheu é: Terça-Feira");
                break;
            case 4:
                System.out.println("O dia que você escolheu é: Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia que você escolheu é: Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia que você escolheu é: Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia que você escolheu é: Sábado");
                break;
            default:
                System.err.println("Escolha um dia valido!");
                System.exit(1);
                scanner.close();
        }
    }
}
