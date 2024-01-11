package TD1.condition.Ex6;

import java.util.Scanner;

public class SigneProduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de A : ");
        int A = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int B = scanner.nextInt();

        int signeProduit = determinerSigneProduit(A, B);

        if (signeProduit > 0) {
            System.out.println("Le produit de A et B est positif.");
        } else if (signeProduit < 0) {
            System.out.println("Le produit de A et B est négatif.");
        } else {
            System.out.println("Le produit de A et B est nul.");
        }

        scanner.close();
    }

    public static int determinerSigneProduit(int A, int B) {
        if (A > 0 && B > 0 || A < 0 && B < 0) {
            return 1;
        } else if (A == 0 || B == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
