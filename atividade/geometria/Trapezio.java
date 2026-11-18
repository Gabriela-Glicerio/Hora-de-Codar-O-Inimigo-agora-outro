import java.util.Scanner;

/*
 * 4 - A Bit of Geometry (Trapézio)
 * Fórmula: A = ((base maior + base menor) . h) / 2
 */
public class Trapezio {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Base maior: ");

        double baseMaior = ler.nextDouble();
        System.out.print("Base menor: ");

        double baseMenor = ler.nextDouble();
        System.out.print("Altura (h): ");

        double h = ler.nextDouble();

        double area = ((baseMaior + baseMenor) * h) / 2;
        System.out.printf("Área do trapézio: %.2f%n", area);
        ler.close();
    }
}
