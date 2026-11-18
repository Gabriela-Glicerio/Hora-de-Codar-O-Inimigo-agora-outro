import java.util.Scanner;

/*
 * 4 - A Bit of Geometry (Losango)
 * Fórmula: A = (diagonal maior . diagonal menor) / 2
 */
public class Losango {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Diagonal maior: ");

        double diagonalMaior = ler.nextDouble();
        System.out.print("Diagonal menor: ");

        double diagonalMenor = ler.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.printf("Área do losango: %.2f%n", area);
        ler.close();
    }
}
