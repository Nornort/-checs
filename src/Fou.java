/**
 * Created by francois on 15/05/17.
 */
public class Fou extends Piece{
	
    /*
        Constructeur de la classe cavalier
        @param Prend en parametre la couleur de la tour
	Renvoi si le déplacement propre au Fou est respecté
    */	
    public Fou(boolean couleur){super(couleur,"Fo");}

    public boolean deplacementPossible(Deplacement mouvement){
        if(Math.abs(mouvement.getdL()) - Math.abs(mouvement.getdC()) == 0) return true;
        return false;
    }
}
