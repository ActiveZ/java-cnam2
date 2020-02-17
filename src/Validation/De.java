package Validation;

import java.util.Random;

public class De {
    Random rd = new Random();
    private  int nbFace=6;

    // constructeur pour spécifier le nombre de face du dé
    public De(int nbFace) { this.nbFace = nbFace;}

    // constructeur par défaut: dé à 6 faces
    public De() {}

    public int lancer() {
        return (rd.nextInt(nbFace) + 1);
    }
}
