package Exercice1;

public class Compteur3 {
    private int pas=0; //attributs

    public Compteur3(int pas) { //constructeur
        this.pas=pas;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    public void getNumber() { //méthode
        System.out.print("Série de " + pas + ": ");
        for (int i = 1; i <= 10; i++) System.out.print(pas*i + ", ");
        System.out.println();
    }
}