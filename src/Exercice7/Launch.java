package Exercice7;

import Exercice6.Classe;
import Exercice6.Eleve;

import java.util.Random;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
}