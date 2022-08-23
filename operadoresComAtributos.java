package _13_logica_4_6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorFinal = 0.0;

        System.out.println("Conta de luz: ");
        double contaDeLuz = valorFinal += scanner.nextDouble();

        System.out.println("Conta de água: ");
        double contaDeAgua = valorFinal += scanner.nextDouble();

        System.out.println("Conta de telefone: ");
        double contaDeTelefone = valorFinal += scanner.nextDouble();

        System.out.println("Conta da escola do filho: ");
        double escolaDoFilho = valorFinal += scanner.nextDouble();

        System.out.println("Fatura do cartão: ");
        double faturaDoCartao = valorFinal += scanner.nextDouble();

        System.out.println("Conta do supermercado: ");
        double contaDoSupermercado = valorFinal += scanner.nextDouble();

        System.out.println("Resultado: " + valorFinal);

        scanner.close();


    }
}
