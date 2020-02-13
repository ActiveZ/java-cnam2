package Exercice7;

public class Joueur {
    private int mise = 0;
    public String  nom = "";
    private De de = new De();

    public Joueur(String nom) {
        this.nom = nom;
    }

    public int getMise() {
        return mise;
    }

    public void setMise(int mise) {
        this.mise = mise;
    }

    public int lanceDe () {
        return de.lancer();
    }
}
