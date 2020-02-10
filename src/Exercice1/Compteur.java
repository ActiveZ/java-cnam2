package Exercice1;

public class Compteur {
    public void getNumber() {
        final int pas = 5;
        System.out.print("Série de " + pas + ": ");
        for (int i = 5; i <= 50; i += pas) System.out.print(i + ", ");
        System.out.println();
    }
}
