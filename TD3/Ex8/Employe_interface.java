package TD3.Ex8;

public interface Employe_interface {


    void gains();

    String toString();


}
class Patron implements Employe_interface {

    private float salaire ;

    private String nom ;

    private String prenom ;

    public Patron(){

    }

    public Patron(String nom, String prenom , float salaire) {
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
    }


    @Override
    public void gains() {
        System.out.println(getSalaire());
    }

    @Override
    public String toString() {
        return "Patron{ Mr."+getNom()+
                " "+getPrenom()+
                "salaire=" + getSalaire() +
                '}';
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
class TravailleurCommission implements Employe_interface {


    private float salaire ;
    private float commision ;

    private String nom ;

    private String prenom;
    private int quantite ;

    public TravailleurCommission(){

    }

    public TravailleurCommission(String nom,String  prenom,float salaire, float commision){
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
        this.commision=commision;
    }
    @Override
    public void gains() {
        System.out.println("votre salaire est "+(getCommision()+getSalaire()));
    }
    @Override
    public String toString() {
        return "TravailleurCommission{ Nom : " +getNom()+
                " prenom : "+getPrenom()+
                "salaire=" + getSalaire() +
                ", commision=" +getCommision()+
                ", quantite=" + getQuantite() +
                '}';
    }
    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public float getCommision() {
        return commision;
    }

    public void setCommision(float commision) {
        this.commision = commision;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
class TravailleurHoraire implements Employe_interface {

    private int retribution ;
    private  int heures ;
    private String nom ;
    private String prenom;

    public TravailleurHoraire() {
    }

    public TravailleurHoraire(String nom, String prenom, int retribution) {
        this.nom=nom;
        this.prenom=prenom;
        this.retribution = retribution;
    }


    @Override
    public void gains() {
        System.out.println("le salaire de Mr."+getNom()+" "+getPrenom()+ " est "+getRetribution());

    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "retribution=" + getRetribution() +
                ", heures=" + getHeures() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                '}';
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getRetribution() {
        return retribution;
    }

    public void setRetribution(int retribution) {
        this.retribution = retribution;
    }
}
