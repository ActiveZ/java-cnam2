package Exercice1;

public class Exercice1 {

    public static void main(String[] args) {
        System.out.println("---------- compteur 5 ------------");
        Compteur cpt5 = new Compteur();
        cpt5.getNumber();
        System.out.println();

        System.out.println("---------- compteur 1 avec pas de 3 ------------");
        Compteur1 cpt1 = new Compteur1();
        cpt1.getNumber(3);
        System.out.println();

        System.out.println("---------- compteur 2 avec pas de 4 ------------");
        Compteur2 cpt2 = new Compteur2(4);
        cpt2.getNumber();
        System.out.println();

        System.out.println("---------- compteur 3 avec pas de 7 ------------");
        Compteur3 cpt3 = new Compteur3(7);
        System.out.println("Mon pas est de: " + cpt3.getPas());
        cpt3.getNumber();
        System.out.println();

    }
}

