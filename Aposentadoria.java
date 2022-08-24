package _13_logica_4_6;

import java.util.Scanner;

public class Aposentadoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Tempo contribuido: ");
        int tempo = scanner.nextInt();

        boolean podeaposentar = idade >= 55 && tempo >= 25;

        if (podeaposentar){
            System.out.println("Pode aposentar");
        }else{
            System.out.println("Não pode aposentar");
        }
        scanner.close();


    }
}
