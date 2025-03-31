package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

public class UsoArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ArCond1 = new ArCondicionado();

        ArCond1.temp =10;
        ArCond1.modo = "Resfriar";


        ArCond1.aumentaTemp();
        ArCond1.aumentaTemp();
        ArCond1.trocarEstacao("Aquecer");
        if(ArCond1.modo.equals("Aquecer")) {

            ArCond1.temp = 30;
            System.out.print("Temperatura: " +ArCond1.temp+ "\nModo: " +ArCond1.modo);

        }




    }
}
