package TD2.Ex3;

import TD2.Ex1.Point;

public class Ex3 {
    public static void main(String[] args) {
        Livre l = new Livre("Cours Java POO","Mehdi",0.0f,2022);
        System.out.println(l.toString());
        Livre l2 = new Livre(l);
        System.out.println(l2.toString());}
    }
