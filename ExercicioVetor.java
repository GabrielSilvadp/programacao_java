package _20_logica_6_4;

import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 5 principais tarefas do dia: ");
        String[] tarefas = new String[6];

        for (int i = 1; i < tarefas.length; i++) {
            System.out.println(i + "º" + "tarefa: ");
            tarefas[i] = scanner.next();
        }
        System.out.println("Tarefas importantes");
        for (int i = 0; i < tarefas.length; i++) {
            System.out.println(i + "º" + tarefas[i]);
        }
    }
}

