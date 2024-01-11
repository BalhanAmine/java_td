package TD1.Boucle.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        if (N >= 0) {
            long factoriel = calculerFactoriel(N);

            System.out.println("Le factoriel de " + N + " est : " + factoriel);
        } else {
            System.out.println("Veuillez entrer un entier naturel positif.");
        }

        scanner.close();
    }

    public static long calculerFactoriel(int N) {
        long factoriel = 1;

        for (int i = 1; i <= N; i++) {
            factoriel *= i;
        }

        return factoriel;
    }
}
