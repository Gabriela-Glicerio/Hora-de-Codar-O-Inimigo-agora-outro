import java.util.Scanner;

/*
 * 7.1 - 5 vezes?
 * Faça um programa que leia 5 valores (considere que não serão informados
 * valores iguais) e escrever a soma dos 2 maiores.
 */
public class Ex07_1_CincoVezes {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double maior1 = Double.NEGATIVE_INFINITY;
        double maior2 = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Valor " + i + ": ");
            double v = ler.nextDouble();
            if (v > maior1) {
                maior2 = maior1;
                maior1 = v;
            } else if (v > maior2) {
                maior2 = v;
            }
        }
        System.out.println("Soma dos 2 maiores: " + (maior1 + maior2));
        ler.close();
    }
}
