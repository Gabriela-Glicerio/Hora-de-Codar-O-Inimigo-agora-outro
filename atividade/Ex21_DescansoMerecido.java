import java.time.Year;
import java.util.Scanner;

/*
 * 21. Descanso merecido
 * Uma empresa quer verificar se um empregado está qualificado para a
 * aposentadoria ou não. Um dos seguintes requisitos deve ser satisfeito:
 * - Ter no mínimo 65 anos de idade.
 * - Ter trabalhado no mínimo 30 anos.
 * - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
 * Faça um algoritmo que leia: o número do empregado (código), o ano de seu
 * nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a
 * idade e o tempo de trabalho do empregado e a mensagem 'Requerer
 * aposentadoria' ou 'Não requerer'.
 */
public class Ex21_DescansoMerecido {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Código do empregado: ");
        int codigo = ler.nextInt();
        System.out.print("Ano de nascimento: ");
        int nascimento = ler.nextInt();
        System.out.print("Ano de ingresso na empresa: ");
        int ingresso = ler.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - nascimento;
        int tempoTrabalho = anoAtual - ingresso;

        System.out.println("Empregado: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
        ler.close();
    }
}
