package Exercice4bis;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Jeu du 421
 */
public class Launch {
    public static void main(String[] args) {
        int nbLancer = 0; // nombre de lancer à effectuer
        int[] tirage = new int[3]; // tableau pour les valeurs de 3 tirages

        Scanner sc = new Scanner(System.in);
        De de = new De();

        System.out.println("Combien de lancer ?");
        nbLancer = sc.nextInt();

        for (int i = 0; i < nbLancer; i++) {
            for (int j = 0; j < 3; j++) tirage[j] = de.lancer(); //tirage de 3 dés dans le tableau tirage
            System.out.println("Tirage: " + Arrays.toString(tirage));
            Arrays.sort(tirage); // tri du tableau tirage en ordre croissant
            if (Arrays.toString(tirage).equals("[1, 2, 4]")) System.out.println("Gagné !!!");
        }
    }
}