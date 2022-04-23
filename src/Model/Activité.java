import java.sql.Date;

public class Activite  {
    private String intitule ;
    private int nb_adherent ; 
    private Date date ; 
    public Activite(String s , int n , Date d){
        this.intitule = s ; 
        this.date = d ;
        this.nb_adherent = n ; 
    }
    public Date getDate() {
        return date;
    }
    public String getIntitule() {
        return intitule;
    }
    public int getNb_adherent() {
        return nb_adherent;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setNb_adherent(int nb_adherent) {
        this.nb_adherent = nb_adherent;
    }
}
