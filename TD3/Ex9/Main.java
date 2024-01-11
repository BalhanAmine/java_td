package TD3.Ex9;

public class Main {
    public static void main(String[] args) {
        Disque dique1 = new Disque("Soukaina", 2 , 4);
        Rectangle rectangle1 = new Rectangle("talibi", 4 , 8);
        dique1.getPerimeter();
        dique1.getAire();
        rectangle1.getPerimeter();
        rectangle1.getAire();
        System.out.println(dique1.toString());
        System.out.println(rectangle1.toString());
    }
}