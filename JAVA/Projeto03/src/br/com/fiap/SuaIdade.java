package br.com.fiap;

import java.util.Scanner;

public class SuaIdade {
    public static void main(String[] args) {
        int anoAtual,anoUser,idadeUser;
        Scanner scan;
        try{
            scan= new Scanner(System.in);

            System.out.print("Digite o ano atual: ");
            anoAtual = scan.nextInt();

            System.out.print("Digite o ano que você nasceu: ");
            anoUser = scan.nextInt();

            idadeUser = anoAtual - anoUser;

            System.out.println("Você tem: "+idadeUser+" Anos.");

        } catch (Exception e) {
            System.out.print("Formato de número incorreto");
        }

    }
}
