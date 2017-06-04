public class Fou extends Piece{
	
    /*
        Constructeur de la classe Fou
        @param Prend en parametre la couleur du Fou
	    La méthode renvoie si le déplacement propre au Fou est respecté
    */	
    Fou(boolean couleur){super(couleur,"Fo");}

    public boolean deplacementPossible(Deplacement mouvement){
        if(Math.abs(mouvement.getdL()) - Math.abs(mouvement.getdC()) == 0) return true;
        return false;
    }
}
