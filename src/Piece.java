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
    public boolean deplacementAutorise(Piece[][] plateau,Deplacement mouvement){
        if(mouvement.getdL() == 0 && mouvement.getdC() == 0) return true;
        else if(!plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ") && plateau[mouvement.getDepart().getLigne()][mouvement.getDepart().getColonne()].couleur == plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].couleur) return false;
        else if(plateau[mouvement.getDepart().getLigne()][mouvement.getDepart().getColonne()].deplacementPossible(mouvement)){
            if(mouvement.getdL() == 0 || mouvement.getdC() == 0){
                for(int i = 1; i < Math.abs(mouvement.getdL()) + Math.abs(mouvement.getdC()); i++){
                    if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne() + i*Integer.signum(mouvement.getdC())].type.equals("  ")) return false;
                }
            }else if(Math.abs(mouvement.getdL()) - Math.abs(mouvement.getdC()) == 0){
                for(int i = 1; i < Math.abs(mouvement.getdL()); i++){
                    if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne() + i*Integer.signum(mouvement.getdC())].type.equals("  ")) return false;
                }
            }
            return true;
        }
        return false;
    }
}
