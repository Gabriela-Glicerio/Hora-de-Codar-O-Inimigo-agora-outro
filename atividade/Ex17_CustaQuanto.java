import java.util.Scanner;

/*
 * 17. Custa quanto?
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
 * porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%
 * sobre o valor da fábrica, escreva um programa para ler o custo de fábrica de
 * um carro, calcular e escrever o custo final ao consumidor.
 */
public class Ex17_CustaQuanto {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Custo de fábrica: R$ ");
        double fabrica = ler.nextDouble();

        double distribuidor = fabrica * 0.28;
        double impostos = fabrica * 0.45;
        double finalConsumidor = fabrica + distribuidor + impostos;

        System.out.printf("Distribuidor (28%%): R$ %.2f%n", distribuidor);
        System.out.printf("Impostos (45%%): R$ %.2f%n", impostos);
        System.out.printf("Custo final ao consumidor: R$ %.2f%n", finalConsumidor);
        ler.close();
    }
}
