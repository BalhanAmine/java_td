package TD1.Tableaux.Ex1;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("donner N ");
        int N = in.nextInt();
        int tab[] = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            tab[i] = r.nextInt(100);
        }
        int min = tab[0];
        int max = tab[0];
        for (int t : tab) {
            System.out.println(t);
            if (t < min)
                min = t;
            if (t > max)
                max = t;
        }
        System.out.println(" max = " + max + "  min = " + min);
    }
}
