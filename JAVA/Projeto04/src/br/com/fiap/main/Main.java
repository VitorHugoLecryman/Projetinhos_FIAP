package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.volume = 3;
        tv.canal = 50;

        tv.trocarCanal(30);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        System.out.print("Canal atual: " +tv.canal+ "\nVolume: "+tv.volume);


    }
}
