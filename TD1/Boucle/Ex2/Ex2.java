package TD1.Boucle.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        if (N >= 0) {
            int somme = calculerSommeEntiersImpairs(N);

            System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);
        } else {
            System.out.println("Veuillez entrer un entier positif.");
        }

        scanner.close();
    }

    public static int calculerSommeEntiersImpairs(int N) {
        int somme = 0;

        for (int i = 1; i < N; i += 2) {
            somme += i;
        }

        return somme;
    }
}
