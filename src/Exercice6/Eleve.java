package Exercice6;

public class Eleve {
    private String nom = "";
    private double note = 0;

    public Eleve(String nom, double note) {
        this.nom = nom;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void getAppreciation() {
        if (note >= 10) { System.out.println("Diplôme obtenu"); }
        else { System.out.println("Recalé"); }
    }
}
