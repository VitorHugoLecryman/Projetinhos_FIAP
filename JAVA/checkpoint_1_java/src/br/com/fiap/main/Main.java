/*
Trabalho feito por:

Pedro de Matos RM:564184

Thiago Andrade RM:562493

Vitor Hugo RM:559349
*/

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rendaFamiliar,gastoComLuz, gastoComAgua,gastoComInternet,valorMensalidadeDaAcademia;
        int numeroDeMoradores;

        Scanner scan = new Scanner(System.in);
        DespesaFamiliar despesa = new DespesaFamiliar();
        try{
            System.out.print("\nDigite a renda total de sua família: ");
            rendaFamiliar = scan.nextDouble();
            System.out.print("\nDigite o número de moradores (Você incluso): ");
            numeroDeMoradores = scan.nextInt();
            System.out.print("\nDigite o gasto com luz: ");
            gastoComLuz = scan.nextDouble();
            System.out.print("\nDigite o gasto com água: ");
            gastoComAgua = scan.nextDouble();
            System.out.print("\nDigite o gasto com internet: ");
            gastoComInternet = scan.nextDouble();
            System.out.print("\nDigite a mensalidade da academia: ");
            valorMensalidadeDaAcademia = scan.nextDouble();

            despesa.rendaFamiliar = rendaFamiliar;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            System.out.printf("\nAs informações sobre a familia são: \n\n Renda familiar valor bruto: R$ %.3f \n Numero de moradores: %d \n Gasto com água: R$ %.3f \n Gasto com Luz: R$ %.3f \n Gasto com Internet: R$%.3f \n Gasto mensal com a academia: R$%.3f \n Gasto total: R$%.3f \n Renda familiar valor líquida: R$%.3f",despesa.rendaFamiliar,despesa.numeroDeMoradores,despesa.gastoComAgua,despesa.gastoComLuz,despesa.gastoComInternet,despesa.valorMensalidadeDaAcademia,despesa.calcularTotalDeDespesas(),despesa.calcularRendaFamiliarLiquida());

        } catch (Exception e) {
            System.out.printf("Formato inválido.");
        }


    }
}
