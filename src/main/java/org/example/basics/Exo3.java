package org.example.basics;

public class Exo3 {
    public static void main(String[] args) {
        int truc = 3;
        double truc2 = 1.5;
        System.out.println("convertion int en double");
        System.out.println("l'addition : " + (truc + truc2));
        System.out.println("la multiplication : " + (truc * truc2));
        System.out.println("la division : " + (truc / truc2));
        System.out.println("le modulo : " + (truc % truc2));
        System.out.println("la soustraction : " + (truc - truc2));

        int resulat = (int) (truc + truc2);
        System.out.println("convertion double en int : " + resulat);
    }
}
