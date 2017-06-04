public class Roi extends Piece{
    /*
        Constructeur de la classe Roi
        @param Prends en paramètre la couleur du Roi
        La méthode renvoie si le déplacement propre au Roi est respecté
    */
    public Roi(boolean couleur){super(couleur,"Ro");}
    public boolean deplacementPossible(Deplacement mouvement){
        if((Math.abs(mouvement.getdL()))<2 && Math.abs(mouvement.getdC())<2) return true;
        return false;
    }
}
