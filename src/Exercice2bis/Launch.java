package Exercice2bis;

public class Launch {
    public static void main(String[] args) {
        final int[] tabTest = {0,1,2,2,2,3,4,6}; // tableau test

        GestTab tab1 = new GestTab(20, 5); // création d'un tableau de dimension 20 rempli de 5
        tab1.afficheTablo();

        GestTab tab2 = new GestTab(); // création d'un tableau de dimension 100 avec des 10
        tab2.afficheTablo();

        GestTab tab3 = new GestTab(tabTest); // création d'un tableau copie de tabTest
        tab3.afficheTablo();
    }
}
