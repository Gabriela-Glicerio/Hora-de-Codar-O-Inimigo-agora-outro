import java.util.Scanner;

/*
 * 18. A pagar
 * Desenvolva um programa para uma revendedora de carros usados que calcula o
 * salário final de seus funcionários vendedores. O algoritmo deve receber como
 * entrada o número de carros vendidos, o valor total das vendas, o salário
 * fixo mensal do vendedor e a comissão fixa por carro vendido.
 * O salário final = salário fixo + comissão fixa por carro vendido + 5% do
 * valor total das vendas. Considere que o salário inicial é de R$ 5.000,00.
 * O programa deve exibir e detalhar cada venda, a comissão e o percentual e
 * exibir o valor final.
 */
public class Ex18_APagar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Número de carros vendidos: ");
        int carros = ler.nextInt();

        double[] vendas = new double[carros];
        double totalVendas = 0;
        for (int i = 0; i < carros; i++) {
            System.out.print("Valor da venda " + (i + 1) + ": R$ ");
            vendas[i] = ler.nextDouble();
            totalVendas += vendas[i];
        }

        System.out.print("Salário fixo mensal (ex.: 5000): R$ ");
        double fixo = ler.nextDouble();
        System.out.print("Comissão fixa por carro vendido: R$ ");
        double comissaoPorCarro = ler.nextDouble();

        double comissaoTotal = comissaoPorCarro * carros;
        double percentual = totalVendas * 0.05;
        double salarioFinal = fixo + comissaoTotal + percentual;

        System.out.println("\n===== DETALHAMENTO =====");
        for (int i = 0; i < carros; i++) {
            System.out.printf("Venda %d: R$ %.2f%n", i + 1, vendas[i]);
        }
        System.out.printf("Total das vendas: R$ %.2f%n", totalVendas);
        System.out.printf("Salário fixo: R$ %.2f%n", fixo);
        System.out.printf("Comissão (%d carros x R$ %.2f): R$ %.2f%n", carros, comissaoPorCarro, comissaoTotal);
        System.out.printf("Percentual (5%% das vendas): R$ %.2f%n", percentual);
        System.out.printf("SALÁRIO FINAL: R$ %.2f%n", salarioFinal);
        ler.close();
    }
}
