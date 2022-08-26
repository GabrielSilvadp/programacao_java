package _17_logica_32_9;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso:");
        Double peso = scanner.nextDouble();
        Boolean pesoLeve = peso <= 60;
        Boolean pesoMedio = (peso >60) && (peso <= 90);

        if (pesoLeve){
            System.out.println("O lutador(a) é peso leve");
        }else if (pesoMedio){
                System.out.println("O lutador(a) é peso medio");
            }else {
                    System.out.println("O lutador(a) é peso pesado");
                }scanner.close();
            }
        }

