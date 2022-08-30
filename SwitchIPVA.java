package _18_logica_5_6;

import java.util.Scanner;

public class SwitchIPVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ultimo número da placa do veiculo:");
        Integer placaDoVeiculo = scanner.nextInt();

        switch (placaDoVeiculo) {
            case 1, 2, 3:
                System.out.println("Sua multa vence no mês de março!");
                break;
            case 4, 5, 6:
                System.out.println("Sua multa vence no mês de abril!");
                break;
            case 7, 8, 9:
                System.out.println("Sua multa vence no mês de maio!");
                break;
            case 0:
                System.out.println("Sua multa vence no mês de junho!");
            default:
                System.exit(1);
                scanner.close();
        }
    }
}

