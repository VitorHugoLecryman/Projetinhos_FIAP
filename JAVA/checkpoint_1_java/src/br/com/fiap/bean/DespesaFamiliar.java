/*
Trabalho feito por:

Pedro de Matos RM:564184

Thiago Andrade RM:562493

Vitor Hugo RM:559349

*/

package br.com.fiap.bean;

    public class DespesaFamiliar {
        public double rendaFamiliar,gastoComLuz,gastoComAgua,gastoComInternet,valorMensalidadeDaAcademia;

        public int numeroDeMoradores;


        public double calcularTotalDeDespesas(){

            double valorAcademiaTotal,totalDespesa ;

            valorAcademiaTotal  = valorMensalidadeDaAcademia * numeroDeMoradores ;

            totalDespesa = gastoComAgua + gastoComInternet + gastoComLuz + valorAcademiaTotal;

            return totalDespesa;
        }

        public double calcularRendaFamiliarLiquida(){

            double valorAcademiaTotal,totalDespesa;

            valorAcademiaTotal   = valorMensalidadeDaAcademia * numeroDeMoradores ;

            totalDespesa = gastoComAgua + gastoComInternet + gastoComLuz + valorAcademiaTotal;

            double rendaFamiliaLiquida = rendaFamiliar - totalDespesa;

            return rendaFamiliaLiquida;

        }

}
