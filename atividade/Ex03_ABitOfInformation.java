import java.util.Scanner;

/*
 * 3 - A Bit of Information
 * Escreva um programa em Java em que o usuário informe o seu nome e em seguida
 * o programa perguntará a idade do usuário. Agora o programa deve exibir a
 * mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
 */
public class Ex03_ABitOfInformation {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Olá, " + nome + ", sua idade é " + idade);

        ler.close();
    }
}
