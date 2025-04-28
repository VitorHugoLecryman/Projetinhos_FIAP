package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
        if (senha.equals("P4assw0rd")) {
            JOptionPane.showMessageDialog(null,"Acesso concedido");
        } else {
            JOptionPane.showMessageDialog(null,"Acesso negado");
        }
        if (senha.equalsIgnoreCase("P4assw0rd")){
            JOptionPane.showMessageDialog(null,"Acesso autorizado");
        }else{
            JOptionPane.showMessageDialog(null,"Acesso não autorizado");

        }
    }
}
