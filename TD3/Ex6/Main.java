package TD3.Ex6;

public class Main {
    public static void main(String[] args) {
        Patron patron = new Patron("TALIBI" , "Soukaina ", 40000);
        TravailleurCommission tc = new TravailleurCommission("Talibi ", "soukaina ", 54000, 4000);
        TravailleurHoraire th = new TravailleurHoraire("suk", "ta" , 2000);
        System.out.println(patron.toString());
        patron.setSalaire(47000);
        System.out.println(patron.toString());
        System.out.println(tc.toString());
        tc.gains();
        System.out.println(tc.toString());
        th.gains();
    }
}