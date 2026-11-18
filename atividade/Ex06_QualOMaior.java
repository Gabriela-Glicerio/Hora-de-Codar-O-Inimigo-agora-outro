import java.util.Scanner;

/*
 * 6 - Qual o maior?
 * Faça um programa para ler 3 valores (considere que não serão informados
 * valores iguais) e escrever o maior deles.
 */
public class Ex06_QualOMaior {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Valor 1: ");
        double a = ler.nextDouble();
        System.out.print("Valor 2: ");
        double b = ler.nextDouble();
        System.out.print("Valor 3: ");
        double c = ler.nextDouble();

        double maior;
        if (a > b && a > c) {
            maior = a;
        } else if (b > c) {
            maior = b;
        } else {
            maior = c;
        }
        System.out.println("O maior valor é: " + maior);
        ler.close();
    }
}
