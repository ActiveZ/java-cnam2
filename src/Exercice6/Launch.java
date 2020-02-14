package Exercice6;

import java.util.Random;

public class Launch {
    public static void main(String[] args) {
        Random rd = new Random();
        Classe maClasse = new Classe("House of code");

        for (int i = 0; i < 20; i++) {
            Eleve e = new Eleve("nom"+i, rd.nextInt(21)); // note dans [0,20]
            maClasse.addEleve(e);
        }

        System.out.println("La moyenne de la classe " + maClasse.getNom() + " est de: " + maClasse.getMoyenne());

    }
}