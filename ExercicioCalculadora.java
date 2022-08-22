package _12_java_2_9;

import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("1)Adição\n2)Subtração\n3)Multiplicação\n4)Divisão\nQual sera a operação? ");
        double operacao = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        double adicao = primeiroNumero + segundoNumero;
        double subtracao = primeiroNumero - segundoNumero;
        double multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / segundoNumero;

        if (operacao == 1) {
            System.out.println("Resultado: " + adicao);
        } else if (operacao == 2) {
            System.out.println("Resultado: " + subtracao);
        } else if (operacao == 3) {
            System.out.println("Resultado: " + multiplicacao);
        } else if (operacao == 4) {
            System.out.println("Resultado: " + divisao);
        } else {
            System.out.println("INVALIDO!");
        }
    }
}