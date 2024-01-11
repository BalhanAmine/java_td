package TD1.Tableaux.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        char[] tab = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        // Stocker le premier élément
        char premierElement = tab[0];

        // Décalage des éléments
        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = tab[i + 1];
        }

        // Placer le premier élément à la fin
        tab[tab.length - 1] = premierElement;

        // Affichage du tableau modifié
        for (char j : tab) {
            System.out.print(j + " ");
        }
    }
}
