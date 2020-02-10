package Exercice1;

public class Compteur1 {
    public void getNumber(int pas) {
        System.out.print("Série de " + pas + ": ");
        for (int i = 1; i <= 10; i++) System.out.print(pas*i + ", ");
        System.out.println();
    }
}
