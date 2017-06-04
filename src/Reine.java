public class Reine extends Piece{
    /*
        Constructeur de la classe Reine
        @param Prends en paramètre la couleur de la Reine
        La méthode renvoie si le déplacement propre à la Reine est respecté
    */
    Reine(boolean couleur){super(couleur,"Re");}
    public boolean deplacementPossible(Deplacement mouvement){
        if(Math.abs(mouvement.getdL()) - Math.abs(mouvement.getdC()) == 0 || mouvement.getdL() * mouvement.getdC() == 0) return true;
        return false;
    }
}
