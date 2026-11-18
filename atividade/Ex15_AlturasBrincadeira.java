/*
 * 15 - Uma Brincadeira Sobre Alturas
 * Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto
 * tem 1,10 metro e cresce 3 centímetros por ano. Construa um programa que
 * calcule e imprima quantos anos serão necessários para que Felisberto seja
 * maior que Anacleto.
 */
public class Ex15_AlturasBrincadeira {
    public static void main(String[] args) {

        int anacleto = 150;
        int felisberto = 110;
        int anos = 0;

        while (felisberto <= anacleto) {
            anacleto += 2;
            felisberto += 3;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos.");
    }
}
