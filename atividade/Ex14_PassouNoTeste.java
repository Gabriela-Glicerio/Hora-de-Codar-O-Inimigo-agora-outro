import java.util.Scanner;

/*
 * 14 - Passou no Teste?
 * Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média
 * final. Considere que a nota de aprovação é 6,5. Logo após escrever a
 * mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar uma
 * resposta. Se a resposta for "S", o programa deve ser executado novamente,
 * caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
 */
public class Ex14_PassouNoTeste {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int aprovados = 0;
        String resposta;

        do {
            double soma = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Nota " + i + ": ");
                soma += ler.nextDouble();
            }
            double media = soma / 6;
            System.out.printf("Média final: %.2f%n", media);

            if (media >= 6.5) {
                aprovados++;
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.print("Calcular a média de outro aluno Sim/Não? ");
            resposta = ler.next();
        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        ler.close();
    }
}
