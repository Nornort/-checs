public class Tour extends Piece{
    /*
        Constructeur de la classe Tour
        @param Prends en paramètre la couleur de la Tour
        La méthode renvoie si le déplacement propre à la Tour est respecté
    */
    public Tour(boolean couleur){super(couleur,"To");}
    public boolean deplacementPossible(Deplacement mouvement){
        if((mouvement.getdL()*mouvement.getdC())==0) return true;
        return false;
    }
}
