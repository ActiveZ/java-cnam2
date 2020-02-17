package Exercice4;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nbLancer = 0;
        int val1 = 0, val2 = 0; //valeurs des 2 tirages pour le jeu

        De de = new De();

        System.out.println("Combien de lancer ?");
        nbLancer = sc.nextInt();

        for (int i=1; i<=nbLancer; i++) { System.out.println("lancer " + i + ": " + de.lancer());}

        System.out.println("\n -----------JEU----------\n");
        System.out.println("Combien de lancer ?");
        nbLancer = sc.nextInt();

        for (int i=1; i<=nbLancer; i++) {
            val1 = de.lancer();
            val2 = de.lancer();
            System.out.print("\nlancer " + i + ": " + val1 + " et " + val2);
            if (val1 == val2 ) { System.out.print(" GAGNE !!!");}
        }
    }
}
