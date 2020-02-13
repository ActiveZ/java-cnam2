package Exercice7;
/**
 * Jeu du 36
 * @auteur : Arnaud Couturier
 * @version : 14/02/2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        int nbJoueur = 0;
        ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>(); //collection d'objets Joueur
        int pot = 0;

        // saisie du nombre de joueur dans l'intervalle [2,6]
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrez le nombre de joueurs (entre 2 et 6): ");
            nbJoueur = sc.nextInt(); // A faire: vérifier validité du paramètre entrant (try/catch)
        } while (nbJoueur < 2 || nbJoueur > 6);

        //instanciation des joueurs et ajout dans la collection listeJoueur
        for (int i=0; i < nbJoueur; i++) {
            sc.nextLine(); // pour vider le scanner
            System.out.println("Quel est le nom du joueur " + i + " ?");
            Joueur joueur = new Joueur(sc.nextLine());
            System.out.println("Combien mise " + joueur.nom + " ?");
            pot += sc.nextInt(); // A faire: vérifier validité du paramètre entrant (try/catch)
            listeJoueur.add(joueur);
        }

        // le jeu
        int i = 0;
        int tirage = 0;
        int tirageSum = 0;

        do {
            tirage = listeJoueur.get(i).lanceDe();
            System.out.println("\nLe joueur " + listeJoueur.get(i).nom + " lance le dé et fait " + tirage);

            if (tirage + tirageSum > 36) {
                System.out.println("Total dépassé, " + listeJoueur.get(i).nom + " est éliminé !");
                listeJoueur.remove(i); // il dégage de la collection
            } else {
                tirageSum += tirage;
                System.out.println("La somme des dés est de " + tirageSum);
                if (tirageSum != 36) {i++;} // passage au joueur suivant si aucun gagnant
            }
            if (i==listeJoueur.size()) {i=0;} // retour au début de la collection si arrivé à la fin
        } while ((listeJoueur.size() > 1) && (tirageSum != 36)); 

        System.out.println("\nLe joueur " + listeJoueur.get(i).nom + " remporte le pot de " + pot + " cacahuètes !!!");
    }
}
