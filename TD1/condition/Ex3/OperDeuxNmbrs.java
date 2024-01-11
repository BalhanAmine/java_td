package TD1.condition.Ex3;

import java.util.Scanner;

public class OperDeuxNmbrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre (b) : ");
        int b = scanner.nextInt();

        System.out.println("Choisissez l'opération :");
        System.out.println("1. Vérifier si la somme a + b est paire.");
        System.out.println("2. Vérifier si le produit ab est pair.");
        System.out.println("3. Connaître le signe de la somme a + b.");
        System.out.println("4. Connaître le signe du produit ab.");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                verifierSommePaire(a, b);
                break;
            case 2:
                verifierProduitPaire(a, b);
                break;
            case 3:
                afficherSigneSomme(a, b);
                break;
            case 4:
                afficherSigneProduit(a, b);
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 4.");
        }

        scanner.close();
    }

    public static void verifierSommePaire(int a, int b) {
        int somme = a + b;
        if (somme % 2 == 0) {
            System.out.println("La somme a + b est paire.");
        } else {
            System.out.println("La somme a + b n'est pas paire.");
        }
    }

    public static void verifierProduitPaire(int a, int b) {
        int produit = a * b;
        if (produit % 2 == 0) {
            System.out.println("Le produit ab est pair.");
        } else {
            System.out.println("Le produit ab n'est pas pair.");
        }
    }

    public static void afficherSigneSomme(int a, int b) {
        int somme = a + b;
        if (somme > 0) {
            System.out.println("La somme a + b est positive.");
        } else if (somme < 0) {
            System.out.println("La somme a + b est négative.");
        } else {
            System.out.println("La somme a + b est nulle.");
        }
    }

    public static void afficherSigneProduit(int a, int b) {
        int produit = a * b;
        if (produit > 0) {
            System.out.println("Le produit ab est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit ab est négatif.");
        } else {
            System.out.println("Le produit ab est nul.");
        }
    }
}
