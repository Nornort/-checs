//création du plateau//
public class Plateau {
    public static String lignes = "ABCDEFGH";
    public Piece[][] plateau = new Piece[8][8];

    //initialisation des pièces du plateau//
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
    
    //renvoi "true" si la case d'arrivée est vide//
    public boolean pieceExiste(String caseDepart){
        int ligneDepart = Plateau.lignes.indexOf(caseDepart.charAt(0));
        int colonneDepart = Character.getNumericValue(caseDepart.charAt(1));
        if(!plateau[ligneDepart][colonneDepart].type.equals("  ")) return true;
        return false;
    }
    
    //renvoi "true" et fais le déplacement si celui-ci est autorisé par la méthode "deplacementAutoriseé"//
    public boolean deplacer(String caseDepart, String caseArrivee){
        int ligneDepart = Plateau.lignes.indexOf(caseDepart.charAt(0));
        int colonneDepart = Character.getNumericValue(caseDepart.charAt(1));
        int ligneArrivee = Plateau.lignes.indexOf(caseArrivee.charAt(0));
        int colonneArrivee = Character.getNumericValue(caseArrivee.charAt(1));
        Deplacement mouvement = new Deplacement(new Coordonnees(ligneDepart,colonneDepart),new Coordonnees(ligneArrivee,colonneArrivee));
        if(plateau[ligneDepart][colonneDepart].deplacementAutorise(plateau,mouvement)){
            plateau[ligneArrivee][colonneArrivee] = plateau[ligneDepart][colonneDepart];
            plateau[ligneDepart][colonneDepart] = new Piece(false, "  ");
            return true;
        }
        return false;
    }
}
