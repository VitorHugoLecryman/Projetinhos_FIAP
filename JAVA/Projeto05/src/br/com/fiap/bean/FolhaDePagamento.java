package br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido(){
        double salarioLiquido = salarioBruto - (salarioBruto * (descontoINSS/100)) - (valorPlanoDeSaude *numeroDeDependentes);
        return salarioLiquido;
    }
}
