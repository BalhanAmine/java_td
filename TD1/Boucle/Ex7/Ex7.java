package TD1.Boucle.Ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        do{
            System.out.println("donner un nbr N");
            n=in.nextInt();
        }while(n<=0);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
