package _13_logica_4_6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorFinal = 0.0;

        System.out.println("Conta de luz: ");
        valorFinal += scanner.nextDouble();

        System.out.println("Conta de água: ");
        valorFinal += scanner.nextDouble();

        System.out.println("Conta de telefone: ");
        valorFinal += scanner.nextDouble();

        System.out.println("Conta da escola do filho: ");
        valorFinal += scanner.nextDouble();

        System.out.println("Fatura do cartão: ");
        valorFinal += scanner.nextDouble();

        System.out.println("Conta do supermercado: ");
        valorFinal += scanner.nextDouble();

        System.out.println("Resultado: " + valorFinal);

        scanner.close();


    }
}
