import java.util.Scanner;

/*
 * 5 - 1, 2 e 3
 * Faça um programa que leia um valor informado pelo usuário e diga se o valor
 * informado é positivo, negativo ou neutro.
 */
public class Ex05_UmDoisETres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = ler.nextDouble();
        if (valor > 0) {
            System.out.println("Positivo");
        } else if (valor < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Neutro");
        }
        ler.close();
    }
}
