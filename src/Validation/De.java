package Validation;

import java.util.Random;

public class De {
    Random rd = new Random();
    private  int nbFace=6;

    // constructeur pour spécifier le nombre de face du dé (option)
    public De(int nbFace) { this.nbFace = nbFace;}

    public int lancer() {
        return (rd.nextInt(nbFace) + 1);
    }
}
