package TD3.Ex4;

public class Main {
    public static void main(String[] args) {
        Batiment b = new Batiment();
        Maison m = new Maison("SETTAT ",2);
        Immeuble i = new Immeuble("EL-JADIDA" , 24);
        System.out.println(b.toString());
        System.out.println(m.toString());
        System.out.println(i.toString());
        b.setAdresse("Casa");
        System.out.println(b.toString());
        m.setAdresse("Agadir");
        System.out.println(m.toString());
        i.setAdresse("Tanger");
        System.out.println(i.toString());
    }
}