package TD2.Ex6;

class Banque{
    private int nCompte;
    private float solde;
    private String cin;
    public Banque(int nCompte, float solde, String cin) {
        this.nCompte = nCompte;
        this.solde = solde;
        this.cin = cin;}
    public void deposer(float solde){
        this.solde += solde;}
    public void retirer(float solde){
        if (this.solde > solde)
            this.solde -= solde;}
    public float avoirSolde() {
        return solde;}
    public String avoirInf() {
        return "Compte{" +
                "nCompte=" + nCompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';}
}
