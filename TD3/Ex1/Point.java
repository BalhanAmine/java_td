package TD3.Ex1;

public class Point {
    public void Point (int x, int y) { this.x = x ; this.y = y ; }
    public void deplace (int dx, int dy) { x += dx ; y += dy ; }
    public void affCoord ()
    { System.out.println ("Coordonnees : " + x + " " + y) ;}
    private int x, y ;}
class PointNom extends Point {
    public void setPointNom(int x, int y, char nom) {
        Point(x, y);
        this.nom = nom;}
    public void setNom(char nom) {
        this.nom = nom;}
    public void affCoordNom() {
        System.out.print("Point de nom " + nom + " ");
        affCoord();}
    private char nom;
    public static void main(String args[]) {
        Point p = new Point();
        p.Point(2, 5);
        p.affCoord();
        PointNom pn1 = new PointNom();
        pn1.setPointNom(1, 7, 'A'); // methode de PointNom
        pn1.affCoordNom();                     // methode de PointNom
        pn1.deplace(9, 3);              // methode de Point
        pn1.affCoordNom();                     // methode de PointNom
    }
}