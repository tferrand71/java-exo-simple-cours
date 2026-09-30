package org.example.poo;

public class Exo2 {
    public void main() {
        Voiture v1 = new Voiture("truc1", "truc2", 2000);
        v1.afficher();
        Voiture v2 = new Voiture("truc3", "truc4", 2001);
        v2.afficher();
    }

}
public class Voiture {
    String marque;
    String modele;
    int annee;

    /**
     * crée une methode d'affichage afficherInfo()
     * instancie deux voiture et affiche leurs infos
     */
public Voiture(String marque, String modele, int annee) {
    this.marque = marque;
    this.modele = modele;
    this.annee = annee;
}
public void afficher() {
    System.out.println(marque + " " + modele + " " + annee);
}


}
