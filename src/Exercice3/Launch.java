package Exercice3;

import java.util.Arrays;

public class Launch {
    public static void main(String[] args) {
        int[] tab = {0,1,2,2,2,3,4,6}; // tableau test
        System.out.println("Tableau test initial: " + Arrays.toString(tab));

        GereTablo gt = new GereTablo(tab);
        gt.getMin();
        gt.getMax();
        gt.getSum();
        System.out.println("Remplacement effectué ?: " + gt.replace2(2,8)); //remplace les 2 par des 8
        System.out.println("Tableau test final: " + Arrays.toString(tab));
    }
}
