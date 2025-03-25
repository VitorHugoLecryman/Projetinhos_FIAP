package br.com.fiap;

import javax.swing.*;

public class SuaIdadeJanela {
    public static void main(String[] args) {
        int anoAtual,anoUser,idadeUser;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual: ");
            anoAtual =Integer.parseInt(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o ano que você nasceu: ");
            anoUser =Integer.parseInt(auxiliar);

            idadeUser = anoAtual - anoUser;

            JOptionPane.showMessageDialog(null,"Você tem: "+idadeUser+" Anos.");



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }
    }
}
