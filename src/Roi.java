/**
 * Created by francois on 15/05/17.
 */
public class Roi extends Piece{
    public Roi(boolean couleur){
        super(couleur,"Ro");
    }
    public boolean deplacementPossible(Deplacement mouvement){
        if((Math.abs(mouvement.getdL()))<2 && Math.abs(mouvement.getdC())<2) return true;
        return false;
    }
}
