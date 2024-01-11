package TD1.condition.Ex5;

import java.util.Scanner;

public class SalutationHeureLangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (en format 24 heures) : ");
        int heure = scanner.nextInt();

        System.out.print("Entrez la langue (f pour français, a pour anglais) : ");
        char langue = scanner.next().charAt(0);

        if (langue == 'f') {
            afficherMessageFrancais(heure);
        } else if (langue == 'a') {
            afficherMessageAnglais(heure);
        } else {
            System.out.println("Langue non reconnue. Veuillez choisir 'f' pour français ou 'a' pour anglais.");
        }

        scanner.close();
    }

    public static void afficherMessageFrancais(int heure) {
        if (heure >= 0 && heure <= 18) {
            System.out.println("Bonjour");
        } else if (heure > 18 && heure <= 22) {
            System.out.println("Bonsoir");
        } else {
            System.out.println("Bonne nuit");
        }
    }

    public static void afficherMessageAnglais(int heure) {
        if (heure >= 0 && heure <= 18) {
            System.out.println("Good Morning");
        } else if (heure > 18 && heure <= 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
