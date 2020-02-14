package Exercice2bis;

import java.util.Arrays;

public class GestTab {
    private int nbEntiers=0; //dimension de tablo
    private int[] tablo;

    public GestTab (int nbEntiers, int val) { // constructeur: remplit le tableau de taille nbEntiers avec des val
        this.nbEntiers = nbEntiers;
        tablo = new int[nbEntiers];
        Arrays.fill(tablo, val);
    }

    public GestTab () { // constructeur par défaut: remplit un tableau de taille 100 avec des 0
        tablo = new int [100];
        Arrays.fill(tablo,10);
    }

    public GestTab (int[] tab) { //constructeur de copie de tableau
        tablo = tab.clone();
    }

    public void afficheTablo() {
        System.out.print("\nLe tableau: ");
        for (int i : tablo) { System.out.print(i + ", "); }
    }
}
