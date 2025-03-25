package br.com.fiap;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4,media;
        Scanner scan;

        try {
            scan= new Scanner(System.in);

            System.out.print("Digite a nota da primeira prova: ");
            prova1 = scan.nextFloat();

            System.out.print("Digite a nota da segunda prova: ");
            prova2 = scan.nextFloat();

            System.out.print("Digite a nota da terceira prova: ");
            prova3 = scan.nextFloat();

            System.out.print("Digite a nota da quarta prova: ");
            prova4 = scan.nextFloat();

            media = (prova1+prova2+prova3+prova4)/4;

            System.out.println("Prova 1: "+prova1+ "\nProva 2: "+prova2+ "\nProva 3: "+ prova3+ "\nProva 4: "+prova4+ "\nA sua média serã: " +media);
        }

        catch (Exception e) {
            System.out.println(("Formato de número incorreto"));
        }
    }
}