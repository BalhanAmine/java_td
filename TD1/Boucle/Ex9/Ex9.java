package TD1.Boucle.Ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        do{
            System.out.println("donner un nbr N");
            n=in.nextInt();
        }while(n<=0);
        int sum=0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("La somme des chiffres  est : " + sum);
    }
}
