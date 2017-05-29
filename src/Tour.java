/**
 * Created by francois on 15/05/17.
 */
public class Tour extends Piece{

    /*
	    Constructeur de la classe tour
	    @param Prend en parametre la couleur de la tour
	*/
    public Tour(boolean couleur){super(couleur,"To");}
    public boolean deplacementPossible(Deplacement mouvement){
        if((mouvement.getdL()*mouvement.getdC())==0) return true;
        return false;
    }
}
