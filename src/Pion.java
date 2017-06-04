
public class Pion extends Piece {
    public Pion(boolean couleur) {super(couleur, "Pi");}

    // 
    public boolean deplacementPossible(Deplacement mouvement) {
        if (mouvement.getdC() == 0){
            if(!this.couleur){
                if(mouvement.getdL() <= (mouvement.getDepart().getLigne() == 1 ? 2 : 1) && mouvement.getdL() > 0) return true;
            }else if(mouvement.getdL() >= (mouvement.getDepart().getLigne() == 6 ? -2 : -1) && mouvement.getdL() < 0) return true;
        }
        return false;
    }
    public boolean deplacementAutorise(Piece[][] plateau,Deplacement mouvement){
        if(mouvement.getdL() == 0 && mouvement.getdC() == 0) return false;
        else if(!plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ") && this.couleur == plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].couleur) return false;
        else if(this.deplacementPossible(mouvement)){
            for(int i = 1; i < Math.abs(mouvement.getdL()); i++){
                if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne()].type.equals("  ")) return false;
            }
            return true;
        }
        return false;
    }
}
