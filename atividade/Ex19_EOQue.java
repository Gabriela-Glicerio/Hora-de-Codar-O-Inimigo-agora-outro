import java.util.Scanner;

/*
 * 19. É o quê?
 * Crie um programa para ler 3 valores (A, B e C) representando as medidas dos
 * lados de um triângulo e escrever se formam ou não um triângulo.
 * Obs: para formar um triângulo, o valor de cada lado deve ser menor que a
 * soma dos outros 2 lados.
 */
public class Ex19_EOQue {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Lado A: ");
        double a = ler.nextDouble();
        System.out.print("Lado B: ");
        double b = ler.nextDouble();
        System.out.print("Lado C: ");
        double c = ler.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores FORMAM um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
        ler.close();
    }
}
