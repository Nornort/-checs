/**
 * Created by francois on 09/05/17.
 */
public class Piece {
    public boolean couleur = false;
    public String type = "  ";
    public Piece(boolean couleur,String type){
        this.couleur = couleur;
        this.type = type;
    }
    public boolean deplacementPossible(Deplacement mouvement){return false;}
}
