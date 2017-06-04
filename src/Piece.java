/* Constructeur de la Pièce
*@param prends paramètre la couleur de la pièce et le type de celle-ci
*/
public class Piece {
    public boolean couleur = false;
    public String type = "  ";
    public Piece(boolean couleur,String type){
        this.couleur = couleur;
        this.type = type;
    }
    public boolean deplacementPossible(Deplacement mouvement){return false;}
    // Renvoi true si le déplacement est autorisé //
    public boolean deplacementAutorise(Piece[][] plateau,Deplacement mouvement){
        // Interdit de déplacer une pièce sur la même case//
        if(mouvement.getdL() == 0 && mouvement.getdC() == 0) return false;
        // Interdit le déplacement la pièce si la pièce sur la case d'arrivée est de couleur identique à celle de départ//
        else if(!plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ") && this.couleur == plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].couleur) return false;
        else if(this.deplacementPossible(mouvement)){
            // Pour le cas d'un déplacement en ligne ou en colonne: autorise le déplacement uniquement s'il n'y a pas de pièce située entre la case de départ et celle située à l'arrivée//
            if(mouvement.getdL() == 0 || mouvement.getdC() == 0){
                for(int i = 1; i < Math.abs(mouvement.getdL()) + Math.abs(mouvement.getdC()); i++){
                    if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne() + i*Integer.signum(mouvement.getdC())].type.equals("  ")) return false;
                }
            // Pour le cas d'un déplacement en diagonale : autorise le déplacement uniquement s'il n'y a pas de pièce située entre la case de départ et celle située à l'arrivée//
            }else if(Math.abs(mouvement.getdL()) - Math.abs(mouvement.getdC()) == 0){
                for(int i = 1; i < Math.abs(mouvement.getdL()); i++){
                    if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne() + i*Integer.signum(mouvement.getdC())].type.equals("  ")) return false;
                }
            }
            return true;
        }
        return false;
    }
    public boolean promotion(Deplacement mouvement){return false;}
}
