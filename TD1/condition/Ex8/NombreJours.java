package TD1.condition.Ex8;

import java.util.Scanner;

public class NombreJours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numéro du mois (1-12) : ");
        int mois = scanner.nextInt();

        if (mois >= 1 && mois <= 12) {
            int joursDansMois = determinerNombreDeJoursDansMois(mois);

            System.out.println("Le nombre de jours dans le mois est : " + joursDansMois);
        } else {
            System.out.println("Numéro de mois invalide. Veuillez entrer un numéro de mois entre 1 et 12.");
        }

        scanner.close();
    }

    public static int determinerNombreDeJoursDansMois(int mois) {
        int joursDansMois;

        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                joursDansMois = 31;
                break;
            case 4: case 6: case 9: case 11:
                joursDansMois = 30;
                break;
            case 2:
                joursDansMois = determinerNombreDeJoursFevrier();
                break;
            default:
                joursDansMois = 0;
        }

        return joursDansMois;
    }

    public static int determinerNombreDeJoursFevrier() {
        Scanner scannerAnnee = new Scanner(System.in);

        System.out.print("Entrez l'année (1900-2100) : ");
        int annee = scannerAnnee.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            return 29;
        } else {
            return 28;
        }
    }
}
