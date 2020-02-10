package Exercice3;

import java.util.Arrays;

public class GereTablo {
    private int[] tablo;

    public GereTablo(int[] tablo) { //constructeur
        this.tablo=tablo;
    }

    public void getMin() {
        Arrays.sort(tablo);
        System.out.println("La plus petite valeur est: " + tablo[0]);
    }

    public void getMax() {
        Arrays.sort(tablo);
        System.out.println("La plus grande valeur est: " + tablo[tablo.length-1]);
    }

    public void getSum() {
        System.out.println("La somme du tableau est: " + Arrays.stream(tablo).sum());
    }

    public void replace(int init, int fin) {
        for (int i = 0; i < tablo.length; i++) {
            if (tablo[i]==init) tablo[i] = fin;
        }
    }

    public boolean replace2(int init, int fin) {
        boolean ok = false; //ok devient vrai si un changement a été effectué
        for (int i = 0; i < tablo.length; i++) {
            if (tablo[i]==init) {
                tablo[i] = fin;
                ok=true;
            }
        }
        return ok;
    }
}
