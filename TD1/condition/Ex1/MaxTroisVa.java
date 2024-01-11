package TD1.condition.Ex1;

import java.util.Scanner;

public class MaxTroisVa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        System.out.print("Entrez la troisième variable : ");
        int c = scanner.nextInt();

        int maximum = getMax(a, b, c);

        System.out.println("Le maximum des trois variables est : " + maximum);

        scanner.close();
    }

    public static int getMax(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }
}
