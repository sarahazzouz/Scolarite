package Model;

public class Facture {
    private String num ; 
    private String montant ; 
    public Facture(String montant , String num){
        this.montant = montant ;  
        this.num = num ; 
    }
    public String getMontant() {
        return montant;
    }
    public String getNum() {
        return num;
    }
    public void setMontant(String montant) {
        this.montant = montant;
    }
    public void setNum(String num) {
        this.num = num;
    }
}