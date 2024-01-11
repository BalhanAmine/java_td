package TD3.Ex5;

public class Vehicule {

    private int nbPassager;

    public Vehicule(int nbPassager){
        this.nbPassager=nbPassager;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {

        this.nbPassager = nbPassager;
    }
}
class Moto extends Vehicule{
    int nbRoues=2;

    public Moto(int nbPassager , int nbRoues){
        super(nbPassager);
        this.nbRoues=nbRoues;
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }
}
class Avion extends Vehicule{
    private int nbMoteur;

    public Avion (int  nbPassager){
        super(nbPassager);
    }

    public Avion(int nbPassager , int nbMoteur){
        super(nbPassager);
        this.nbMoteur=nbMoteur;
    }


    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    public int getNbMoteur() {
        return nbMoteur;
    }
}
class Triporteur extends Moto{
    int nbTri;

    public Triporteur(int nbPassager , int nbRoues , int nbTri){
        super(nbPassager, nbRoues);
        this.nbTri=nbTri;
    }
}