package org.example.basics;

import java.util.Scanner;

/**
 * verification si nombre premier ou non
 */
public class Exo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();

        boolean premier = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                premier = false;
                break;
            }
        }

        if (premier) {
            System.out.println(n + " est un nombre premier");
        } else {
            System.out.println(n + " n'est pas un nombre premier");
        }
    }
}
