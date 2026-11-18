import java.util.Scanner;

/*
 * 4 - A Bit of Geometry (Quadrado)
 * Fórmula: A = lado . lado = lado²
 */
public class Quadrado {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Lado: ");

        double lado = ler.nextDouble();

        double area = lado * lado;
        System.out.printf("Área do quadrado: %.2f%n", area);
        ler.close();
    }
}
