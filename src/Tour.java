/**
 * Created by francois on 15/05/17.
 */
public class Tour extends Piece{
    public Tour(boolean couleur){
        super(couleur,"To");
    }
    public boolean deplacementPossible(Piece[][] plateau, int numeroPiece,int ligne, int colonne){
        /*
        char ligne = caseDeplacement.charAt(0);
        char colonne = caseDeplacement.charAt(1);
        int j = Character.getNumericValue(ligne);
        int j = Character.getNumericValue(colonne);
        j -= 1;
        */
        int k = 0, l = 0, m = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(plateau[i][j].type == "Pi") k++;
                if(numeroPiece == k){
                    l = i;
                    m = j;
                }
            }
        }
    }
}
