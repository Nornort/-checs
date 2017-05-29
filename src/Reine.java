/**
 * Created by francois on 15/05/17.
 */
public class Reine extends Piece{
    public Reine(boolean couleur){super(couleur,"Re");}
    public boolean deplacementPossible(Deplacement mouvement){
        if((Math.abs(mouvement.getdL()) - Math.abs(mouvement.getdC())) == 0 || (mouvement.getdL() * mouvement.getdC() == 0)) return true;
        return false;
    }
}
