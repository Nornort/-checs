/**
 * Created by francois on 15/05/17.
 */
public class Cavalier extends Piece{

    /*
	    Constructeur de la classe cavalier
	    @param Prend en parametre la couleur de la tour
	*/
    public Cavalier(boolean couleur){super(couleur,"Ca");}
    public boolean deplacementPossible(Deplacement mouvement){
        if((Math.abs(mouvement.getdL())==2 && Math.abs(mouvement.getdC())==1) || ((Math.abs(mouvement.getdL())==1 && Math.abs(mouvement.getdC())==2))) return true;
        return false;
    }
}
