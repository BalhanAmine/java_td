package TD1.condition.Ex2;

import java.util.Scanner;

public class EquationQuadratique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux solutions réelles distinctes : " + root1 + " et " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Une solution réelle unique : " + root);
        } else {
            System.out.println("Pas de solution réelle, les solutions sont complexes.");
        }

        scanner.close();
    }
}
