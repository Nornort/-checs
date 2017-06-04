
public class Pion extends Piece {
    public Pion(boolean couleur) {super(couleur, "Pi");}

    //Déplacement propre du pion
    public boolean deplacementPossible(Deplacement mouvement) {
        if(mouvement.getdC() == 0){
            //Peut se déplacer de deux lignes au départ, le sens du déplacement dépend de la couleur du pion
            if(!this.couleur && mouvement.getdL() <= (mouvement.getDepart().getLigne() == 1 ? 2 : 1) && mouvement.getdL() > 0) return true;
            else if(this.couleur && mouvement.getdL() >= (mouvement.getDepart().getLigne() == 6 ? -2 : -1) && mouvement.getdL() < 0) return true;
        }
        return false;
    }
    //Contrairement aux autres pièces le pion ne mange pas comme il se déplace (cf. classe Piece)
    public boolean deplacementAutorise(Piece[][] plateau,Deplacement mouvement){
        // Interdit de déplacer une pièce sur la même case//
        if(mouvement.getdL() == 0 && mouvement.getdC() == 0) return false;
        // Interdit le déplacement la pièce si la pièce sur la case d'arrivée est de couleur identique à celle de départ//
        else if(!plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].type.equals("  ") && this.couleur == plateau[mouvement.getArrivee().getLigne()][mouvement.getArrivee().getColonne()].couleur) return false;
        // Pour le cas d'un déplacement en ligne autorise le déplacement uniquement s'il n'y a pas de pièce située entre la case de départ et celle située à l'arrivée comprise//
        else if(this.deplacementPossible(mouvement)){
            for(int i = 1; i <= Math.abs(mouvement.getdL()); i++){
                if(!plateau[mouvement.getDepart().getLigne() + i*Integer.signum(mouvement.getdL())][mouvement.getDepart().getColonne()].type.equals("  ")) return false;
            }
            return true;
            // Pour le cas d'une absorption en diagonale//
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
