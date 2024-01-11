package TD3.Ex9;

public interface Figure_interface {

    String nom = "";

    String getPerimeter();

    String getAire();

    @Override
    String toString() ;

}
class Disque implements Figure_interface {

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
    public String getPerimeter() {
        return "le perimetre de ce disque est "+2*Math.PI*getRayon();
    }

    @Override
    public String getAire() {
        return "l'aire de ce disque est "+Math.PI*getRayon()*getRayon();
    }

    @Override
    public String toString() {
        return "Disque{" +
                "rayon=" + getRayon() +
                ", centre=" + getCentre() +
                '}';
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    public int getCentre() {
        return centre;
    }
}
class Rectangle implements Figure_interface {

    private int longeur ;
    private int largeur ;

    public Rectangle(){

    }
    public Rectangle(int longeur , int largeur){
        this.largeur=largeur;
        this.longeur=longeur;
    }
    public Rectangle(String nom , int largeur , int longeur){
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + getLongeur() +
                ", largeur=" + getLargeur() +
                '}';
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