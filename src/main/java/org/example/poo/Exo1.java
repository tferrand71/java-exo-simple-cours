package org.example.poo;

/**
 * crée une classe personne
 * ajoute un constructeur pour initialiser les valeurs
 * crée un objet Personne et affiche ses infos
 */
public class Exo1 {
    public static void main(String[] args) {
        Personne p1 = new Personne("Alice", 25);
        p1.afficher();

        Personne p2 = new Personne("Bob", 40);
        p2.afficher();
    }
}
