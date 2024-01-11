package TD1.Tableaux.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("donner le nbr des etudiant ");
        int n=in.nextInt();
        int tab[]=new int[n];
        int compt=0;
        for(int i=0;i< tab.length;i++){
            System.out.println("donner la moyenne d'etudiants "+(i+1));
            int moy=in.nextInt();
            if(moy>=12)
                compt++ ;
        }
        System.out.println("on a "+compt+" etudiant qui on la moyenne superieur ou egale a le seuil 12");

    }
}
