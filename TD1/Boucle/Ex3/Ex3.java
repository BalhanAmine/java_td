package TD1.Boucle.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombreMax = Integer.MIN_VALUE;
        int positionMax = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Entrez le nombre " + i + " : ");
            int nombre = scanner.nextInt();

            if (nombre > nombreMax) {
                nombreMax = nombre;
                positionMax = i;
            }
        }

        System.out.println("Le maximum parmi les 20 nombres est : " + nombreMax);
        System.out.println("Il a été saisi à la position : " + positionMax);

        // Question 3
        System.out.println("Entrez une suite de nombres (terminez par 0) : ");

        int maxDansSuite = Integer.MIN_VALUE;
        int positionMaxDansSuite = 0;
        int nombreDansSuite;

        int position = 0;
        do {
            System.out.print("Entrez le nombre " + (position + 1) + " : ");
            nombreDansSuite = scanner.nextInt();
            position++;

            if (nombreDansSuite != 0 && nombreDansSuite > maxDansSuite) {
                maxDansSuite = nombreDansSuite;
                positionMaxDansSuite = position;
            }
        } while (nombreDansSuite != 0);

        System.out.println("Le maximum dans la suite est : " + maxDansSuite);
        System.out.println("Il a été saisi à la position : " + positionMaxDansSuite);

        scanner.close();
    }
}
