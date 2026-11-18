import java.util.Scanner;

/*
 * 4 - A Bit of Geometry (Triângulo)
 * Fórmula: A = (base . altura) / 2
 */
public class Triangulo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Base: ");

        double base = ler.nextDouble();
        System.out.print("Altura: ");

        double altura = ler.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("Área do triângulo: %.2f%n", area);
        ler.close();
    }
}
