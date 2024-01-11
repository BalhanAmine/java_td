package TD1.Boucle.Ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n , un=0, un1=1, un2=1;
        System.out.println("entrer la valeur de N");
        n = in.nextInt();
        if (n==0 || n==1) {
            System.out.println(1);
            return;
        }
        System.out.print("1 1 ");
        for (int i = 2; i <= n; i++) {
            un = un1 + un2;
            un2 = un1;
            un1 = un;
            System.out.print(un + " ");
        }

    }
}
