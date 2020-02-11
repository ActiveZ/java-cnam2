package Exercice5;

import java.awt.*;

public class Launch {
    public static void main(String[] args) {
        Angle angle = new Angle(60,"");

        System.out.println("Angle de base: " + angle.getAngleDeg());
        angle.addition(60);
        angle.soustraction(30);
        angle.multiplication(3);
        angle.degToRad();
        angle.sinus();
        angle.cosinus();
        angle.tangente();

    }
}
