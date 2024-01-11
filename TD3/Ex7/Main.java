package TD3.Ex7;

public class Main {
    public static void main(String[] args) {
        Disque disque = new Disque( 2 , 4);
        Rectangle rectangle = new Rectangle(5 , 10);
        disque.getPerimeter();
        disque.getAire();
        rectangle.getAire();
        rectangle.getPerimeter();
    }
}