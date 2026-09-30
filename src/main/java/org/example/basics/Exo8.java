package org.example.basics;

/**
 * Faire un triangle d'étoile avec boucle imbriquée
 */
public class Exo8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
