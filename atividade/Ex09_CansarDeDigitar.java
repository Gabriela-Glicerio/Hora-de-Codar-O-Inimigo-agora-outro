import java.util.Scanner;

/*
 * 9 - Cansar de Digitar
 * Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba
 * os números informados e escreva a média aritmética desses valores lidos.
 */
public class Ex09_CansarDeDigitar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] valores = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = ler.nextDouble();
            soma += valores[i];
        }

        System.out.println("Números informados:");
        for (double v : valores) {
            System.out.println(v);
        }
        System.out.println("Média aritmética: " + (soma / 10));
        ler.close();
    }
}
