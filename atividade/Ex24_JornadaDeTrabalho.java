import java.util.Scanner;

/*
 * 24. Jornada de trabalho
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor
 * da hora regular com um acréscimo de 50%.
 * Escreva um programa que leia o número de horas trabalhadas em um mês, o
 * salário por hora e escreva o salário total do funcionário, que deverá ser
 * acrescido das horas extras, caso tenham sido trabalhadas (considere que o
 * mês possua 4 semanas exatas).
 */
public class Ex24_JornadaDeTrabalho {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
        System.out.print("Horas trabalhadas no mês: ");
        double horas = ler.nextDouble();
        System.out.print("Salário por hora: R$ ");
        double valorHora = ler.nextDouble();

        double limiteMensal = 40 * 4;
        double salario;

        if (horas > limiteMensal) {
            double extras = horas - limiteMensal;
            salario = limiteMensal * valorHora + extras * valorHora * 1.5;
            System.out.println("Horas extras: " + extras);
        } else {
            salario = horas * valorHora;
        }
        System.out.printf("Salário total: R$ %.2f%n", salario);
        ler.close();
    }
}
