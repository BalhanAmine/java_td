package TD1.Boucle.Ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier positif non nul (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif non nul (b) : ");
        int b = scanner.nextInt();

        if (a > 0 && b > 0) {
            int pgcd = calculerPGCD(a, b);

            System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
        } else {
            System.out.println("Veuillez entrer des entiers positifs non nuls.");
        }

        scanner.close();
    }

    public static int calculerPGCD(int a, int b) {
        int temp;

        do {
            temp = b;
            b = a % b;
            a = temp;
        } while (b != 0);

        return a;
    }
}
