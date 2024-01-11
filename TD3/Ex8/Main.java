package TD3.Ex8;

public class Main {
    public static void main(String[] args) {
        Patron patron1 = new Patron("TALIBI" , "SOUKAINA" , 45000);
        TravailleurCommission tc1 = new TravailleurCommission("laila ", "libourki ", 40000 , 5000);
        TravailleurHoraire th1 = new TravailleurHoraire("ayoub ", "salfi", 50);
        patron1.getSalaire();
        patron1.gains();
        System.out.println(patron1.toString());
        tc1.setSalaire(41000);
        tc1.gains();
        System.out.println(tc1.toString());
        th1.gains();
        System.out.println(th1.toString());
    }
}