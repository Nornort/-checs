/**
 * Created by francois on 15/05/17.
 */
public class Plateau {
    public Piece[][] plateau = new Piece[8][8];

    public Plateau() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j ++) {
                plateau[i][j] = new Piece(false, 0);
            }
        }
        for (int i = 0; i < 8; i += 7) {
            boolean couleur = false;
            int k = 0;
            if(i == 7) couleur = true;
            if (i == 7) k = 1;
            for (int j = 0; j < 8; j += 7) {
                plateau[i][j] = new Tour(couleur);
            }
            for (int j = 1; j < 7; j += 5) {
                plateau[i][j] = new Cavalier(couleur);
            }
            for (int j = 2; j < 6; j += 3) {
                plateau[i][j] = new Fou(couleur);
            }
            plateau[i][3 + k] = new Roi(couleur);
            plateau[i][4 - k] = new Reine(couleur);
        }
    }
}
