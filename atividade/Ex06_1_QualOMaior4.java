import java.util.Scanner;

/*
 * 6.1 - Qual o maior? (4 vezes pior)
 * Faça um programa para ler 4 valores (considere que não serão informados
 * valores iguais) e escrever o maior deles.
 */
public class Ex06_1_QualOMaior4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Valor 1: ");
        double a = ler.nextDouble();
        System.out.print("Valor 2: ");
        double b = ler.nextDouble();
        System.out.print("Valor 3: ");
        double c = ler.nextDouble();
        System.out.print("Valor 4: ");
        double d = ler.nextDouble();

        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        if (d > maior) maior = d;

        System.out.println("O maior valor é: " + maior);
        ler.close();
    }
}
