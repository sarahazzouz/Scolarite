package Model;

public class Cantine {
	//Hello
    private String nom;
    private int nb_place ;
    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNb_place() {
        return nb_place;
    }
    public String getNom() {
        return nom;
    }
    public Cantine (String m , int n ){
        this.nb_place = n ; 
        this.nom = m ; 
    }
}