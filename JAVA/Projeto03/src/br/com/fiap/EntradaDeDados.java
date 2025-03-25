package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner scan;
        try{
            scan = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            num1 = scan.nextInt();

            System.out.print("Digite outro número inteiro: ");
            num2 = scan.nextInt();

            resultado = num1 + num2;

            System.out.println("Valor 1: "+num1+ "\nValor 2: "+num2+ "\nA soma dos valores: " +resultado);

        } catch (Exception e) {
            System.out.println(("Formato de número incorreto"));
        }
    }
}
