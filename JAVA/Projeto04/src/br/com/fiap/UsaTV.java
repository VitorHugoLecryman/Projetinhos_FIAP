package br.com.fiap;

public class UsaTV {
    public static void main(String[] args) {
        TV  tele1 = new TV();

        tele1.volume = 3;
        tele1.canal = 50;

        tele1.trocarCanal(30);
        tele1.aumentarVolume();
        tele1.aumentarVolume();
        tele1.aumentarVolume();
        tele1.diminuirVolume();

        System.out.print("Canal atual: " +tele1.canal+ "\nVolume: "+tele1.volume);


    }
}
