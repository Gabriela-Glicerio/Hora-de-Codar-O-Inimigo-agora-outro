import java.util.Scanner;

/*
 * 20. CPF na nota?
 * Faça um programa para ler o nome do produto, a quantidade adquirida e o
 * preço unitário. Calcular e escrever: o valor da venda (quantidade * preço),
 * o percentual de desconto, o valor fixo de imposto que é 20% e o total a
 * pagar (valor da venda - desconto).
 * Desconto: quantidade <= 5 -> 2% | > 5 e <= 10 -> 3% | > 10 -> 5%.
 * No fim, escrever um recibo que detalhe a compra como uma nota fiscal.
 */
public class Ex20_CpfNaNota {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String produto = ler.nextLine();
        System.out.print("Quantidade adquirida: ");
        int quantidade = ler.nextInt();
        System.out.print("Preço unitário: R$ ");
        double preco = ler.nextDouble();

        double valorVenda = quantidade * preco;

        double percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 2;
        } else if (quantidade <= 10) {
            percentualDesconto = 3;
        } else {
            percentualDesconto = 5;
        }

        double desconto = valorVenda * percentualDesconto / 100;
        double imposto = valorVenda * 0.20; // imposto fixo de 20% (informativo)
        double totalPagar = valorVenda - desconto; // conforme o enunciado

        System.out.println("\n========== NOTA FISCAL ==========");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", percentualDesconto, desconto);
        System.out.printf("Imposto (20%%): R$ %.2f%n", imposto);
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", totalPagar);
        System.out.println("=================================");
        ler.close();
    }
}
