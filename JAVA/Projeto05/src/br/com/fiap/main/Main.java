package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento sl = new FolhaDePagamento();
        sl.salarioBruto = 50000;
        sl.descontoINSS = 10.0;
        sl.valorPlanoDeSaude = 250;
        sl.numeroDeDependentes = 4;

        System.out.println(sl.calcularSalarioLiquido());
    }

}
