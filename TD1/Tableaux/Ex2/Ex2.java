package TD1.Tableaux.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("donner N");
        int n=in.nextInt();
        int []a = new int[32];
        int i = 0;
        while (n > 0) {
            a[i] = n % 2;
            n /= 2;
            i++;
        }
        System.out.println("Représentation binaire : ");
        for (int j =i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }

    }
}
