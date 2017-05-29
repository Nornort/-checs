
public class Pion extends Piece {
    public Pion(boolean couleur) {super(couleur, "Pi");}

    public boolean deplacementPossible(Deplacement mouvement) {
        if (mouvement.getdC() == 0){
            if(!this.couleur){
                if(mouvement.getdL() <= (mouvement.getDepart().getLigne() == 1 ? 2 : 1) && mouvement.getdL() > 0) return true;
            }else if(mouvement.getdL() >= (mouvement.getDepart().getLigne() == 6 ? -2 : -1) && mouvement.getdL() < 0) return true;
        }
        return false;
    }
}
