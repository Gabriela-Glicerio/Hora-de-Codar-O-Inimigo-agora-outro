import java.util.Scanner;

/*
 * 13 - De quanto até quanto?
 * Faça um algoritmo que calcule e escreva a média aritmética dos dois números
 * inteiros informados pelo usuário e todos os números inteiros entre eles.
 * Considere que o primeiro sempre será menor que o segundo.
 */
public class Ex13_DeQuantoAteQuanto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int inicio = ler.nextInt();
        System.out.print("Segundo número: ");
        int fim = ler.nextInt();

        int soma = 0;
        int quantidade = 0;
        for (int i = inicio; i <= fim; i++) { // inclui os dois extremos
            soma += i;
            quantidade++;
        }
        System.out.println("Média aritmética: " + ((double) soma / quantidade));
        ler.close();
    }
}
