package Exercice4;

import java.util.Random;

public class De {
    Random rd = new Random();
    private  int nbFace=6;
    private int val = 0;

    // constructeur pour spécifier le nombre de face du dé
    public De(int nbFace) {
        if (nbFace > 3) {
            this.nbFace = nbFace;
            val = this.lancer();
        } else {
            System.out.println("ERREUR: le nombre de face doit etre supérieur à 3"); }
    }

    // constructeur par défaut: dé à 6 faces
    public De() {}

    public int getNbFace() {
        return nbFace;
    }

    public int getVal() {
        return val;
    }

    public int lancer() {
        val = rd.nextInt(nbFace) + 1;
        return val;
    }
}
