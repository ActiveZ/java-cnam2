package Exercice7;

import java.util.Scanner;

public class Jeu {
    Scanner sc = new Scanner(System.in);
    private int nbJoueur; // nombre de joueurs
    private Joueur [] tabJoueur; // tableau des joueurs

    public Jeu(int nbJoueur) {
        this.nbJoueur = nbJoueur;
        tabJoueur = new Joueur[nbJoueur];
        creationTablo();
    }

    public void creationTablo() { //création du tableau des joueurs
        for (int i = 0; i < nbJoueur; i++) {
            System.out.println("Nom du joueur " + (i+1) + " ?");
            String nom = sc.nextLine(); //récupération du nom du joueur
            Joueur joueur = new Joueur(nom);
            tabJoueur[i] = joueur; // ajout au tableau des joueurs
        }
    }

    public void demarreJeu() { // chaque joueur joue à tour de role jusqu'à avoir un gagnant (score>= 100)
        int i = 0;
        int cpt = 1; // nombre de tours de jeu
        do {
            tabJoueur[i].jouer();

            System.out.println("Le joueur " + tabJoueur[i].getName() + " tire " + tabJoueur[i].getTirage() + " score total: " + tabJoueur[i].getScore());
            if (tabJoueur[i].getScore() < 100) { // passer au joueur suivant si pas tirage gagnant
                i++;
                if (i == tabJoueur.length) { // retour au début du tableau si arrivé à la fin
                    i = 0;
                    cpt++;
                    System.out.println("Tour suivant:" + "(" + cpt + ")");
                }
            }
        } while (tabJoueur[i].getScore() < 100);

        System.out.println("Le joueur " + tabJoueur[i].getName() + " a gagné !!!");
    }
}
