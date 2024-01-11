package TD1.condition.Ex4;

import java.util.Scanner;

public class MentionEtudiant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        String mention = determinerMention(moyenne);

        System.out.println("La mention de l'étudiant est : " + mention);

        scanner.close();
    }

    public static String determinerMention(double moyenne) {
        if (moyenne >= 16) {
            return "Très Bien";
        } else if (moyenne >= 14) {
            return "Bien";
        } else if (moyenne >= 12) {
            return "Assez Bien";
        } else if (moyenne >= 10) {
            return "Passable";
        } else {
            return "Insuffisant";
        }
    }
}
