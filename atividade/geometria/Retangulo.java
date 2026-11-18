import java.util.Scanner;

/*
 * 4 - A Bit of Geometry (Retângulo)
 * Calcula e exibe a área. O usuário informa os valores das variáveis.
 * Fórmula: A = base . altura
 */
public class Retangulo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Base: ");

        double base = ler.nextDouble();
        System.out.print("Altura: ");

        double altura = ler.nextDouble();

        double area = base * altura;
        System.out.printf("Área do retângulo: %.2f%n", area);
        ler.close();
    }
}
