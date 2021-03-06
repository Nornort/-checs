public class Cavalier extends Piece{

    /*
	    Constructeur de la classe Cavalier
	    @param Prend en parametre la couleur du Cavalier
	    La méthode renvoie si le déplacement propre au Cavalier est respecté
	*/
    Cavalier(boolean couleur){super(couleur,"Ca");}
    public boolean deplacementPossible(Deplacement mouvement){
        if((Math.abs(mouvement.getdL())==2 && Math.abs(mouvement.getdC())==1) || ((Math.abs(mouvement.getdL())==1 && Math.abs(mouvement.getdC())==2))) return true;
        return false;
    }
}
