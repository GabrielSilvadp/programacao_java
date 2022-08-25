package _16_logica_5_2;

import java.util.Scanner;

public class ExercicioNotaProva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de portugues: ");
        Float notaPortugues = scanner.nextFloat();

        System.out.print("Digite a nota de matematica: ");
        Float notaMatematica = scanner.nextFloat();

        Float somaDasDuasNotas = notaMatematica + notaPortugues;
        Boolean minimoParaAProvaDeMatematica = notaMatematica >= 60;
        Boolean minimoParaAProvaDePortugues = notaPortugues >= 60;
        Boolean notaMinimaParaAprovacao = somaDasDuasNotas >= 150;

        if (minimoParaAProvaDeMatematica && minimoParaAProvaDePortugues && notaMinimaParaAprovacao){
            System.out.println("Passou!");
        }else{
            System.out.println("Não Passou!");
        } scanner.close();
    }
}
