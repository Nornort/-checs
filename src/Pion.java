
public class Pion extends Piece {
    public Pion(boolean couleur) {super(couleur, "Pi");}

    // déplacement propre du pion //
    public boolean deplacementPossible(Deplacement mouvement) {
        if(mouvement.getdC() == 0){
            if(!this.couleur && mouvement.getdL() <= (mouvement.getDepart().getLigne() == 1 ? 2 : 1) && mouvement.getdL() > 0) return true;
            else if(this.couleur && mouvement.getdL() >= (mouvement.getDepart().getLigne() == 6 ? -2 : -1) && mouvement.getdL() < 0) return true;
        }
        return false;
    }
    public boolean deplacementAutorise(Piece[][] plateau,Deplacement mouvement){
        if(mouvement.getdL() == 0 && mouvement.getdC() == 0) return false;
        else if(!plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ") && this.couleur == plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].couleur) return false;
        else if(this.deplacementPossible(mouvement)){
            for(int i = 1; i <= Math.abs(mouvement.getdL()); i++){
                if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne()].type.equals("  ")) return false;
            }
            return true;
        }else if(Math.abs(mouvement.getdL()) == 1 && Math.abs(mouvement.getdC()) == 1 && !plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ")) {
            if(!this.couleur && mouvement.getdL() > 0) return true;
            else if(this.couleur && mouvement.getdL() < 0) return true;
        }
        return false;
    }
    // transforme un pion en reine s'il atteint la ligne opposée à sa ligne initiale //
    public boolean promotion(Deplacement mouvement){
        if(!this.couleur && mouvement.getArrivee().getLigne() == 7) return true;
        else if(this.couleur && mouvement.getArrivee().getLigne() == 0) return true;
        return false;
    }
}
