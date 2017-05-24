/**
 * Created by francois on 15/05/17.
 */
public class Plateau {
    public Piece[][] plateau = new Piece[8][8];

    public Plateau() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j ++) {
                plateau[i][j] = new Piece(false, "  ");
            }
        }
        for (int i = 0; i < 8; i += 7) {
            boolean couleur = false;
            if(i == 7) couleur = true;
            for (int j = 0; j < 8; j ++) {
                plateau[i + 1 - (i % 5)][j] = new Pion(couleur);
            }
            for (int j = 0; j < 8; j += 7) {
                plateau[i][j] = new Tour(couleur);
            }
            for (int j = 1; j < 7; j += 5) {
                plateau[i][j] = new Cavalier(couleur);
            }
            for (int j = 2; j < 6; j += 3) {
                plateau[i][j] = new Fou(couleur);
            }
            plateau[i][3 + (i % 6)] = new Roi(couleur);
            plateau[i][4 - (i % 6)] = new Reine(couleur);
        }
    }
    public boolean pieceExiste(String piece){
        for(int i = 0;i < 8;i++){
            for(int j = 0;j < 8;j++){
                if(piece.equals(plateau[i][j].type) && !piece.equals("  ")) return true;
            }
        }
        return false;
    }
}
