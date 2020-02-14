package Exercice6;

import java.util.ArrayList;

public class Classe {
    private String nom="";
    private ArrayList<Eleve> tabloEleves = new ArrayList<Eleve>(20);

    public Classe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void addEleve(Eleve eleve) {
        tabloEleves.add(eleve);
    }

    public double getMoyenne() {
        double sum = 0;
        for ( Eleve e : tabloEleves) {sum += e.getNote();}
        return  sum/tabloEleves.size(); //vérifier taille tablo
    }
}
