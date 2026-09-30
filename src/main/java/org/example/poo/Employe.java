package org.example.poo;

/**
 * classe employer avec methode calculerSalaire
 * Classe Manager et Developpeur herite de Employer
 * Manager a un bonus, Developpeur un nombre d'heures supp
 * Utiliser du polymophisme : stock tous les employer dans un tableau et affiche leur salaire
 */
public class Employe {
    String nom;
    double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    // comportement par defaut : un employe touche son salaire de base
    public double calculerSalaire() {
        return salaireBase;
    }

    public void afficher() {
        System.out.println(nom + " gagne " + calculerSalaire() + " euros");
    }

    public static void main(String[] args) {
        // le tableau est de type Employe, mais contient des Manager et des Developpeur
        Employe[] employes = {
                new Employe("Alice", 2000),
                new Manager("Bob", 3000, 500),
                new Developpeur("Charlie", 2500, 10)
        };

        for (Employe e : employes) {
            e.afficher();
        }
    }
}

// pas de "public" ici : une seule classe publique par fichier
class Manager extends Employe {
    double bonus;

    public Manager(String nom, double salaireBase, double bonus) {
        super(nom, salaireBase);
        this.bonus = bonus;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + bonus;
    }
}

class Developpeur extends Employe {
    int heuresSupp;

    public Developpeur(String nom, double salaireBase, int heuresSupp) {
        super(nom, salaireBase);
        this.heuresSupp = heuresSupp;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + (heuresSupp * 25);
    }
}
