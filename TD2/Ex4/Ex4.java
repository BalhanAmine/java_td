package TD2.Ex4;

import TD2.Ex1.Point;

public class Ex4 {
    public static void main(String[] args) {
        Temps t = new Temps(3,10,10);
        System.out.println(t.toString());
        t.ajouterMinutes(180);
        System.out.println(t);
        t.ajouterSecondes(3660);
        System.out.println(t);
    }
}
