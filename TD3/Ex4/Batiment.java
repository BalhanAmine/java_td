package TD3.Ex4;

public class Batiment{

    private String adresse ;

    public Batiment(){

    }
    public Batiment(String adresse ){
        this.adresse=adresse;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
class Maison extends Batiment{
    int nbChambres ;

    public Maison(){
        super();
    }

    public Maison(String adresse , int nbChambres ){
        super(adresse);
        this.nbChambres=nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + this.getNbChambres() +
                " adresse : "+this.getAdresse()+
                '}';
    }
}
class Immeuble extends Batiment{

    int nbAppart ;

    public Immeuble(){
        super();
    }

    public Immeuble(String adresse , int nbAppart ){
        super(adresse);
        this.nbAppart=nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + this.getNbAppart() +
                " adresse : "+this.getAdresse()+
                '}';
    }
}
