// prends en compte la couleur de la pièce et le type de celle-ci//
public class Piece {
    public boolean couleur = false;
    public String type = "  ";
    public Piece(boolean couleur,String type){
        this.couleur = couleur;
        this.type = type;
    }
    public boolean deplacementPossible(Deplacement mouvement){return false;}
    //autorise le déplacement uniquement s'il n'y a pas de pièce située entre la case de départ et celle située à l'arrivée//
    //et si la pièce sur la case d'arrivée est de couleur opposée à celle de départ//
    public boolean deplacementAutorise(Piece[][] plateau,Deplacement mouvement){
        if(mouvement.getdL() == 0 && mouvement.getdC() == 0) return false;
        else if(!plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ") && this.couleur == plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].couleur) return false;
        else if(this.deplacementPossible(mouvement)){
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
    public boolean promotion(Deplacement mouvement){return false;}
}
