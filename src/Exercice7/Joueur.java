package Exercice7;

public class Joueur {
    public String  nom = "";
    private De de = new De();

    public Joueur(String nom) {
        this.nom = nom;
    } //constructeur

    public int lanceDe () {
        return de.lancer();
    }
}
