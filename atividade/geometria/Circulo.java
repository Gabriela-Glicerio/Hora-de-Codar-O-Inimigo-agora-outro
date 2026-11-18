import java.util.Scanner;

/*
 * 4 - A Bit of Geometry (Círculo)
 * Fórmula: A = π . r²
 */
public class Circulo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Raio: ");
        double r = ler.nextDouble();
        double area = Math.PI * r * r;
        System.out.printf("Área do círculo: %.2f%n", area);
        ler.close();
    }
}
