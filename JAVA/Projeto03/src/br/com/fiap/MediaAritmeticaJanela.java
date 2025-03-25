package br.com.fiap;

import javax.swing.*;

public class MediaAritmeticaJanela {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4,media;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
            prova1 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
            prova2 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da terceira prova: ");
            prova3 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da quarta prova: ");
            prova4 = Float.parseFloat(auxiliar);

            media = (prova1+prova2+prova3+prova4)/4;

            JOptionPane.showMessageDialog(null,"Prova 1: "+prova1+ "\nProva 2: "+prova2+ "\nProva 3: "+ prova3+ "\nProva 4: "+prova4+ "\nA sua média serã: " +media);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }
    }
}
