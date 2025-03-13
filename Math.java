import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = entrada.nextLine();

        System.out.print("Digite a idade desta pessoa: ");
        int idade1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = entrada.nextLine();

        System.out.print("Digite a idade desta pessoa: ");
        int idade2 = entrada.nextInt();

        int soma = idade1 + idade2;
        int sub = idade1 - idade2;

        if (idade1 < idade2) {

            sub = java.lang.Math.abs(sub);
            System.out.println("As difereças de idade de " + nome1 + " e " + nome2 + "\nSomando = " + soma + "\nSubtraindo = " + sub);
        }
        else {
            System.out.println("As difereças de idade de " + nome1 + " e " + nome2 + "\nSomando = " + soma + "\nSubtraindo = " + sub);
        }
    }
}