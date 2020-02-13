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

        //instanciation des joueurs et ajout dans la collection
        for (int i=0; i < nbJoueur; i++) {
            sc.nextLine(); // pour vider le scanner
            System.out.println("Quel est le nom du joueur " + i + " ?");
            Joueur joueur = new Joueur(sc.nextLine());
            System.out.println("Combien mise " + joueur.nom + " ?");
            pot += sc.nextInt(); // A faire: vérifier validité du paramètre entrant (try/catch)
            listeJoueur.add(joueur);
        }



        for  (Joueur j : listeJoueur) {System.out.println(j.nom + " lance et fait: " + j.lanceDe());}

    }
}
