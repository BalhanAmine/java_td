package TD3.Ex7;

import java.lang.Math;
public abstract class Figure {

    private String nom ;

    public Figure() {

    }
    protected Figure(String nom) {

        this.nom = nom;
    }


    public abstract String getPerimeter();

    public abstract String getAire();

    @Override
    public String toString() {
        return "Figure{" +
                "nom=" + nom +
                '}';
    }
}
class Disque extends Figure{

    private int rayon ;
    private int centre ;


    public Disque() {

    }
    public Disque( int rayon , int centre) {

        this.rayon=rayon;
        this.centre = centre;
    }
    public Disque( String nom , int rayon , int centre) {

        this.rayon=rayon;
        this.centre = centre;
    }

    @Override
    public String getPerimeter(){
        return "le perimetre de ce disque est "+2*Math.PI*getRayon();
    }

    @Override
    public String getAire() {
        return "l'aire de ce disque est "+Math.PI*getRayon()*getRayon();
    }

    public int getCentre() {
        return centre;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
}
class Rectangle extends Figure{
    private int longeur ;
    private int largeur ;


    public Rectangle(){

    }
    public Rectangle(int longeur , int largeur){
        this.largeur=largeur;
        this.longeur=longeur;
    }
    public Rectangle(String nom , int largeur , int longeur){
        super(nom);
        this.largeur=largeur;
        this.longeur=longeur;
    }

    @Override
    public String getPerimeter() {
        return "le perimetre de ce rectangle est "+2*(getLargeur()+getLongeur());
    }

    @Override
    public String getAire() {
        return " l'aire de ce rectangle est "+getLargeur()*getLongeur();
    }
    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
