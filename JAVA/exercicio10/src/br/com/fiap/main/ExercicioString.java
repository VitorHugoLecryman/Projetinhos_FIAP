package br.com.fiap.main;

import javax.swing.*;
import java.util.Scanner;

public class ExercicioString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase,fraseSub1,fraseSub2;


        System.out.print("Digite uma frase: ");
        frase = scan.nextLine();

        System.out.print(("Digite uma palavra que deseja substituir"));
        fraseSub1 = scan.nextLine();

        System.out.print(("Digite outra palavra que irá substituir"));
        fraseSub2 = scan.nextLine();

        System.out.printf("Frase: %s \n Quantidade: %s\n  Maiúscula: %s\n Replace: %s",frase,frase.length(),frase.toUpperCase(),frase.replace(fraseSub1,fraseSub2));

    }
}
