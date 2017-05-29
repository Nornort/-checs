/**
 * Created by francois on 09/05/17.
 */
public class Piece {
    public boolean couleur;
    public String type = "  ";
    public Piece(boolean couleur,String type){
        this.couleur = couleur;
        this.type = type;
    }
    public boolean deplacer(Piece[][] plateau, String caseDepart, String caseArrivee){
        int ligneDepart = Plateau.lignes.indexOf(caseDepart.charAt(0));
        int colonneDepart = Character.getNumericValue(caseDepart.charAt(1));
        int ligneArrivee = Plateau.lignes.indexOf(caseArrivee.charAt(0));
        int colonneArrivee = Character.getNumericValue(caseArrivee.charAt(1));
        Deplacement mouvement = new Deplacement(new Coordonnees(ligneDepart,colonneDepart),new Coordonnees(ligneArrivee,colonneArrivee));
        if(plateau[ligneDepart][colonneDepart].deplacementPossible(mouvement)){

        }
        return false;
    }
    public boolean deplacementPossible(Deplacement mouvement){return false;}
}
