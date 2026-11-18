import java.util.Scanner;

/*
 * 7 - Qual o quê?
 * Faça um programa que leia 3 valores (considere que não serão informados
 * valores iguais) e escrever a soma dos 2 maiores.
 */
public class Ex07_QualOQue {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Valor 1: ");
        double a = ler.nextDouble();
        System.out.print("Valor 2: ");
        double b = ler.nextDouble();
        System.out.print("Valor 3: ");
        double c = ler.nextDouble();

        double menor = Math.min(a, Math.min(b, c));
        double soma = a + b + c - menor;
        System.out.println("Soma dos 2 maiores: " + soma);
        ler.close();
    }
}
