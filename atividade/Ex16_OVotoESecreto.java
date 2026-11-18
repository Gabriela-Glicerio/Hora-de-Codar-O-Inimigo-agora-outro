import java.util.Scanner;

/*
 * 16. O Voto é secreto
 * Escreva um programa para ler o número total de eleitores de um município,
 * e a quantidade de votos brancos, válidos e nulos. Por fim, calcular e
 * escrever o percentual que cada categoria (brancos, nulos e válidos)
 * representa em relação ao total de eleitores.
 */
public class Ex16_OVotoESecreto {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Total de eleitores: ");
        double total = ler.nextDouble();
        System.out.print("Votos brancos: ");
        double brancos = ler.nextDouble();
        System.out.print("Votos válidos: ");
        double validos = ler.nextDouble();
        System.out.print("Votos nulos: ");
        double nulos = ler.nextDouble();

        System.out.printf("Brancos: %.2f%%%n", brancos * 100 / total);
        System.out.printf("Válidos: %.2f%%%n", validos * 100 / total);
        System.out.printf("Nulos: %.2f%%%n", nulos * 100 / total);
        ler.close();
    }
}
