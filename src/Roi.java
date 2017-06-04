/**
 * @param Prends en paramètre la couleur
 */
public class Roi extends Piece{
    public Roi(boolean couleur){
        super(couleur,"Ro");
    }
    /**
    Renvoi si le déplacement propre au Cavalier est respecté
    */
    public boolean deplacementPossible(Deplacement mouvement){
        if((Math.abs(mouvement.getdL()))<2 && Math.abs(mouvement.getdC())<2) return true;
        return false;
    }
}
