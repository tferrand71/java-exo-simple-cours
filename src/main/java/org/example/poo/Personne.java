package org.example.poo;

public class Personne {
    String nom;
    int age;

    // constructeur : reçoit les valeurs au moment de créer l'objet
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Je m'appelle " + nom + " et j'ai " + age + " ans");
    }
}
