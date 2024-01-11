package TD1.condition.Ex7;

import java.util.Scanner;

public class PermutationNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int nombre = scanner.nextInt();

        if (estEntierTroisChiffresNonNuls(nombre)) {
            // Afficher les nombres formés par les chiffres de N
            System.out.print("Les nombres formés par les chiffres de " + nombre + " sont : ");
            afficherNombresFormes(nombre);
        } else {
            System.out.println("Veuillez entrer un entier de trois chiffres non nuls.");
        }

        scanner.close();
    }

    public static boolean estEntierTroisChiffresNonNuls(int nombre) {
        return nombre >= 100 && nombre <= 999 && nombre % 100 != 0;
    }

    public static void afficherNombresFormes(int nombre) {
        int centaine = nombre / 100;
        int dizaine = (nombre % 100) / 10;
        int unite = nombre % 10;

        System.out.print(nombre + ", ");
        System.out.print(centaine * 100 + dizaine * 10 + unite + ", ");
        System.out.print(centaine * 100 + unite * 10 + dizaine + ", ");
        System.out.print(dizaine * 10 + centaine * 100 + unite + ", ");
        System.out.print(dizaine * 10 + unite * 100 + centaine + ", ");
        System.out.print(unite * 100 + centaine * 10 + dizaine + ", ");
        System.out.println(unite * 100 + dizaine * 10 + centaine);
    }
}
