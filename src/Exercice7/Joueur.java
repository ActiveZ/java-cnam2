package Exercice7;

import java.util.Arrays;
import java.util.Random;

public class Joueur {
    Random rd = new Random();
    private String nomJoueur;
    private int score = 0;
    private int [] tabLancer = new int [6];

    public Joueur(String nomJoueur) { // constructeur
        this.nomJoueur = nomJoueur;
    }

    public String getName() {
        return nomJoueur;
    }

    public int getScore() {
        return score;
    }

    public String getTirage() {
        return Arrays.toString(tabLancer);
    }

    public void jouer() {
        for (int i = 0; i < 6; i++) {
            tabLancer[i] = rd.nextInt(6) + 1;
        }
        score += scoreTirage(tabLancer);
    }

    private int scoreTirage (int[] tab) { // todo: test unitaire
        Arrays.sort(tab);
        int i = 0;
        int somme = -5;
        while(i < 6 && tab[i] == i+1) { // faire tests dans cet ordre !
            somme +=5;
            i++;
        }
        if (somme < 0) {somme = 0;} // cas ou joueur ne marque rien
        return somme;
    }
}
