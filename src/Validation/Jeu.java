package Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {
    private int nbJoueur = 0;
    private ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>(); //collection d'objets Joueur
    private int pot = 0; // montant du pot

    //initialisation du jeu
    private void initJeu() {
        // saisie du nombre de joueur dans l'intervalle [2,6]
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrez le nombre de joueurs (entre 2 et 6): ");
            nbJoueur = sc.nextInt(); // todo: vérifier validité du paramètre entrant (try/catch)
        } while (nbJoueur < 2 || nbJoueur > 6);

        //instanciation des joueurs et ajout dans la collection listeJoueur
        for (int i=0; i < nbJoueur; i++) {
            sc.nextLine(); // pour vider le scanner
            System.out.println("Quel est le nom du joueur " + i + " ?");
            Joueur joueur = new Joueur(sc.nextLine());
            System.out.println("Combien mise " + joueur.nom + " ?");
            pot += sc.nextInt(); // todo: vérifier validité du paramètre entrant (try/catch)
            listeJoueur.add(joueur);
        }
    }

    // le jeu
    public void jouer() {
        int i = 0;
        int tirage = 0; // tirage du joueur
        int tirageSum = 0; // somme des tirages des joueurs

        initJeu();

        do {
            tirage = listeJoueur.get(i).lanceDe();
            System.out.println("\nLe joueur " + listeJoueur.get(i).nom + " lance le dé et fait " + tirage);

            if (tirage + tirageSum > 36) { // si le joueur dépasse 36, il est éliminé
                System.out.println("Total dépassé, " + listeJoueur.get(i).nom + " est éliminé !");
                listeJoueur.remove(i); // il dégage de la collection
            } else { // sinon, son tirage de dé s'additionne dans tiragesum
                tirageSum += tirage;
                System.out.println("La somme des dés est de " + tirageSum);
                if (tirageSum != 36) {i++;} // passage au joueur suivant si aucun gagnant
            }
            if (i==listeJoueur.size()) {i=0;} // retour au début de la collection si arrivé à la fin
        } while ((listeJoueur.size() > 1) && (tirageSum != 36));

        System.out.println("\nLe joueur " + listeJoueur.get(i).nom + " remporte le pot de " + pot + " cacahuètes !!!");
    }
}
