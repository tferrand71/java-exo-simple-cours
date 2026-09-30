package org.example.basics;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un nombre : ");
    int n = sc.nextInt();

    if (n % 2 == 0)
        System.out.println("c'est pair");
    else
        System.out.println("c'est impair");

    }
}
