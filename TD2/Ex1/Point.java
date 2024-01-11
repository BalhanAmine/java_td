package TD2.Ex1;

public class Point {
    String nom;
    double abscisse;
    public Point(String nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;}
    public void afficher(){
        System.out.println("Point : "+this.nom + "(" + this.abscisse + ")");}
    public void translate(double dx){
        this.abscisse += dx;}
}
