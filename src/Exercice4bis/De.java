package Exercice4bis;

import java.util.Random;

public class De {
    Random rd = new Random();
    private  int nbFace=6;

    public De(int nbFace) { // constructeur pour fixer le nb de face du dé
        this.nbFace = nbFace;
    }

    public De() { // constructeur par défaut: dé 6 faces
        this.nbFace = 6;
    }

    public int lancer() {
        return (rd.nextInt(nbFace) + 1);
    }
}
