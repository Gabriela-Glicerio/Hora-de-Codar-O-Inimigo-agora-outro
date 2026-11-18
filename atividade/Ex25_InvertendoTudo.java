import java.util.Scanner;

/*
 * 25. Invertendo tudo
 * Escreva um programa que leia doze números informados pelo usuário e que
 * serão armazenados em um vetor/array. No fim o programa deve dar duas saídas:
 * 1) inverter a posição dos elementos trocando o primeiro com o último, o
 *    segundo com o penúltimo etc.
 * 2) inverter a posição dos elementos, mas separando os dados por tipo.
 * Exemplo: Usuário informa: A, 1, B, 2, C, 3, D, 4, E, 5, F, 6
 *   Saída 1: 6, F, 5, E, 4, D, 3, 2, B, 1 (inversão total)
 *   Saída 2: 6, 5, 4, 3, 2, 1 - F, E, D, C, B, A (números, depois letras)
 */
public class Ex25_InvertendoTudo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String[] dados = new String[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            dados[i] = ler.next();
        }

        String[] invertido = new String[12];
        for (int i = 0; i < 12; i++) {
            invertido[i] = dados[11 - i];
        }
        System.out.println("Saída 1: " + String.join(", ", invertido));


        StringBuilder numeros = new StringBuilder();
        StringBuilder letras = new StringBuilder();
        for (int i = 11; i >= 0; i--) {
            String item = dados[i];
            if (item.matches("-?\\d+(\\.\\d+)?")) { // é número?
                if (numeros.length() > 0) numeros.append(", ");
                numeros.append(item);
            } else {
                if (letras.length() > 0) letras.append(", ");
                letras.append(item);
            }
        }
        System.out.println("Saída 2: " + numeros + " - " + letras);
        ler.close();
    }
}
