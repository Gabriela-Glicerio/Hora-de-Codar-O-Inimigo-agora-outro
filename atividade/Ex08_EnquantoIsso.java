import java.util.Scanner;

/*
 * 8 - Enquanto isso
 * Faça um programa para ler 2 valores informados pelo usuário e se o segundo
 * valor informado for neutro, deve ser lido um novo valor - ou seja, para o
 * segundo valor não pode ser aceito o valor zero nem um valor negativo. O
 * programa deve imprimir o resultado da divisão do primeiro valor lido pelo
 * segundo valor lido.
 */
public class Ex08_EnquantoIsso {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double v1 = ler.nextDouble();

        System.out.print("Segundo valor: ");
        double v2 = ler.nextDouble();
        while (v2 <= 0) {
            System.out.print("Valor inválido! Informe um valor maior que zero: ");
            v2 = ler.nextDouble();
        }

        System.out.println("Resultado da divisão: " + (v1 / v2));
        ler.close();
    }
}
