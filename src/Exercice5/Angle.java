package Exercice5;

import static java.lang.Math.*;

public class Angle {
    private double angleDeg;
    private double angleRad;

    public Angle(double angle) {
        if (angle > 360) angle = angle % 360;
        angleDeg=angle;
        angleRad = toRadians(angleDeg);
        System.out.println("deg");
    }

    public Angle(double angle, String rad) {
        if (angle > 2*PI) angle = angle % (2*PI); // erreur pas modulo avec diviseur pas entier
        angleRad = angle;
        angleDeg = toDegrees(angleRad);
        System.out.println("rad");
    }

    public double getAngleDeg() {
        return angleDeg;
    }

    public double getAngleRad() {
        return angleRad;
    }

    public void addition (double angle) {
        System.out.println("Somme = " + (angleDeg + angle) % 360);
    }

    public void soustraction (double angle) {
        System.out.println("Soustraction = " + (angleDeg - angle) % 360);
    }

    public void multiplication (int multiplicateur) {
        System.out.println("Multiplication = " + (angleDeg * multiplicateur) % 360);
    }

    public void degToRad () {
        System.out.println(toDegrees(angleDeg) + " degrés = " + angleRad + " Radians");
    }

    public void sinus () {
        System.out.println("Sinus " + angleDeg + " = " + sin(angleRad));
    }

    public void cosinus () {
        System.out.println("Cosinus " + angleDeg + " = " + cos(angleRad));
    }

    public void tangente () {
        System.out.println("Tangente " + angleDeg + " = " + tan(angleRad));
    }

}
