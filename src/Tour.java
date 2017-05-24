/**
 * Created by francois on 15/05/17.
 */
public class Tour extends Piece{
    public Tour(boolean couleur){
        super(couleur,"To");
    }
    public boolean deplacementPossible(int numeroPiece, String caseDeplacement){
        String ligne = caseDeplacement[0];
        int j = toInt(caseDeplacement[1]);
    }
}
