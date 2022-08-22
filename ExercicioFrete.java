package _12_java_2_9;

import java.util.Scanner;

public class ExercicioFrete{


      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor do produto: ");
            Double valorDoProduto = scanner.nextDouble();

            boolean valorSemFrete = valorDoProduto >= 100;
            boolean valorComFrete = valorDoProduto < 100;
            Double valorComFreteAplicado = valorDoProduto + 15;

            if (valorSemFrete){
                  System.out.println("Valor final: " + valorDoProduto);
            } else if (valorComFrete) {
                  System.out.println("Valor do produto: " + valorComFreteAplicado);

            }


      }
}
