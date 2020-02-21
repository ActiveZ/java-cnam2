package Validation;

public class Joueur {
    public String  nom = "";
    private De de = new De(6);

    public Joueur(String nom) {
        this.nom = nom;
    } //constructeur

    public int lanceDe () {
        return de.lancer();
    } // methode de tirage de dé
}
