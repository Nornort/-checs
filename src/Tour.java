public class Tour extends Piece{

    /*
	    Constructeur de la classe tour
	    @param Prend en parametre la couleur de la tour
	*/
    public Tour(boolean couleur){super(couleur,"To");}
	/*Renvoi si le déplacement propre à la Tour est respecté
	*/
    public boolean deplacementPossible(Deplacement mouvement){
        if((mouvement.getdL()*mouvement.getdC())==0) return true;
        return false;
    }
}
