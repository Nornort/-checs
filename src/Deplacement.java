/**
 * Created by francois on 29/05/17.
 */
public class Deplacement {
    //Coordonnées case de départ
    private Coordonnees depart;

    //Coordonnées case d'arrivée
    private Coordonnees arrivee;

    //Déplacement sur les lignes
    private int dL;

    //Déplacement sur les colonnes
    private int dC;

    /*
        CONSTRUCTEUR
        @param prend en paramètre les coordonnées de départ et d'arrivée
    */
    public Deplacement (Coordonnees depart, Coordonnees arrivee){
        this.arrivee = arrivee;
        this.depart = depart;
        this.dL = arrivee.getLigne() - depart.getLigne();
        this.dC = arrivee.getColonne() - depart.getColonne();
    }


    //getter
    public int getdL(){
        return dL;
    }

    public int getdC(){
        return dC;
    }

    public Coordonnees getDepart(){
        return depart;
    }

    public Coordonnees getArrivee(){
        return arrivee;
    }

}
