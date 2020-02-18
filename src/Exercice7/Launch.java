package Exercice7;

import java.util.Scanner;

public class Launch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        afficheMenu();

        //acquisition du nombre de joueur
        System.out.println("Combien de joueurs ?");
        int nbJoueur = sc.nextInt();
        if (nbJoueur < 2) {
            System.out.println("ERREUR: 2 joueurs au minimum");
            System.exit(1);
        }
        //lancement du jeu
        Jeu jeu = new Jeu(nbJoueur);
        jeu.demarreJeu();
    }


        //----------------- CHANTIER----------------------
/*

        switch (afficheMenu()) {
            case 1:
                //acquisition du nombre de joueur
                System.out.println("Combien de joueurs ?");
                int nbJoueur = sc.nextInt();
                if (nbJoueur < 2) {
                    System.out.println("ERREUR: 2 joueurs au minimum");
                    System.exit(1);
                }
                //initialisation du jeu
                Jeu jeu = new Jeu(nbJoueur);
                break;
            case 2:
                //acquisition du nom des joueurs
                //jeu.creationTablo();
        }


        //lancement du jeu
        //Jeu jeu = new Jeu(nbJoueur);
        //jeu.demarreJeu();

    }
*/

    private static int afficheMenu() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        System.out.println("---------JEU DE LA SUITE----------");
        System.out.println("1: Entrer le nombre de joueurs");
        System.out.println("2: Entrer le nom de tous les joueurs");
        System.out.println("3: Jouer");
        System.out.println("4: Afficher le gagnant");
        System.out.println("5: Quitter");
        do {
            choix = sc.nextInt();
            if (choix < 1 || choix > 5 ) {System.out.println("Entrez un choix entre 1 et 5");}
        } while (choix < 1 || choix > 5);
        return choix;
    }
}