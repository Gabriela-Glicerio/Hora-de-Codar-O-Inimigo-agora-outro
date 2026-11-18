import java.util.Scanner;

/*
 * 2 - Hello Clarice
 * Escreva um programa em Java em que o usuário informe o seu nome e exiba a
 * mensagem "Olá, [NomeDoUsuario]".
 */
public class Ex02_HelloClarice {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Olá, " + nome);
        ler.close();
    }
}
