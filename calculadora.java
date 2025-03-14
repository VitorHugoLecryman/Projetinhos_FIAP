import java.util.Scanner; //Import da classe Scanner, que vai ler

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número: ");
            double num1 = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("Digite o segundo número: ");
            double num2 = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("Digite uma das opções que deseja calcular os números digitados: \n Soma \n Subtração \n Divisão \n Multiplicação\n");
            String escolha = entrada.nextLine();

            double soma = num1 + num2;

            double sub = num1 - num2;

            double div = num1 / num2;

            double multi = num1 * num2;

            String mens = "Veja o resultado dos números digitados: ";

            escolha = escolha.toUpperCase();

            if (escolha.equals("SOMA")) {

                System.out.println(mens);
                System.out.println(+(int)num1 + " + " + (int) num2 + " = " + (int) soma);

            } else if (escolha.equals("SUBTRAÇÃO") || escolha.equals("SUBTRACAO")) {

                System.out.println(mens);
                System.out.println(+(int)num1 + " - " + (int)num2 + " = " + (int)sub);

            } else if (escolha.equals("DIVISÃO") || escolha.equals("DIVISAO")) {
                System.out.println(mens);
                System.out.println(+num1 + " / " + num2 + " = " + div);
            } else if (escolha.equals("MULTIPLICAÇÃO") || escolha.equals("MULTIPLICACAO")) {
                System.out.println(mens);
                System.out.println(+num1 + " * " + num2 + " = " + multi);
            } else {
                System.out.println("O calculo digitado não está disponível ou não existe");
                System.out.println(escolha);
            }
            System.out.print("Deseja fazer outro cálculo? (Digite 's' para sim ou qualquer outra tecla para sair): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Programa finalizado.");
            }
        }
    }
}