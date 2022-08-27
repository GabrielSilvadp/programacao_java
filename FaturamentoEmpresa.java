package _17_logica_32_9;

import java.util.Scanner;

public class FaturamentoEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a meta de faturamento para esse ano: ");
        Double meta = scanner.nextDouble();
        System.out.println("Digite o faturamento: ");
        Double faturamento = scanner.nextDouble();
        System.out.println("Digite a media salarial dos ultimos 12 meses: ");
        Double mediaSalarial = scanner.nextDouble();
        Double oitentaPorCentoDaMeta = (meta * 80)/100;
        Boolean bateuAMeta = faturamento >= meta;
        Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
        if (bateuAMeta){
            System.out.println("Você vai ganhar um bônus de 100%! Ele sera de: " + mediaSalarial);
        } else if (faturouPeloMenosOitentaPorCento){
            Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 0.8); //ou (mediaSalarial * 80) / 100
            System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
        }else{
            System.out.println("Infelizmente, esse ano não tem bônus!");
        }
    }
}
