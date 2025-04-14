package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        Scanner scan = new Scanner(System.in);
        /*tv.setVolume(21);
        tv.setCanal(5);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.setCanal(14);*/

        System.out.print("\nDigite o volume: ");
        int volume = scan.nextInt();
        tv.setVolume(volume);

        System.out.print("\nDigite o canal: ");
        int canal = scan.nextInt();
        tv.setCanal(canal);

        System.out.printf("Canal: %d \nVolume Atual: %d",tv.getCanal(),tv.getVolume());

        System.out.println("\nDesejar alterar o volume? (S)im ou (N)ão");
        String escolha1 = scan.next();

        if (escolha1.equals("Sim") || escolha1.equals("sim") || escolha1.equals("s") || escolha1.equals("S"))
        {
            System.out.print("\nDigite o volume: ");
            int volume1 = scan.nextInt();
             tv.setVolume(volume1);

            System.out.printf("Canal: %d \nVolume Atual: %d",tv.getCanal(),tv.getVolume());

        } else {

            System.out.print("\nDesejar alterar o canal? (S)im ou (N)ão");
            String escolha2 = scan.next();

            if (escolha2.equals("Sim") || escolha2.equals("sim") || escolha2.equals("s") || escolha2.equals("S")) {
                System.out.print("\nDigite o canal que deseja: ");
                int canal1 = scan.nextInt();
                tv.setCanal(canal1);
            }
        }
    }
}
