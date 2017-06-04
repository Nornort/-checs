//création du plateau//
public class Plateau {
    public static String lignes = "ABCDEFGH";
    //Création du plateau
    public Piece[][] plateau = new Piece[8][8];
    //Initialisation des pièces sur le plateau
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
    
    //Renvoie "true" si la case de départ sélectionnée n'est pas vide et est de la bonne couleur
    public boolean pieceExiste(String caseDepart, boolean couleur){
        int ligneDepart = Plateau.lignes.indexOf(caseDepart.charAt(0));
        int colonneDepart = Character.getNumericValue(caseDepart.charAt(1));
        if(!plateau[ligneDepart][colonneDepart].type.equals("  ") && plateau[ligneDepart][colonneDepart].couleur == couleur) return true;
        return false;
    }
    
    //Renvoie "true" et fais le déplacement si celui-ci est autorisé par la méthode "deplacementAutoriseé" de la pièce concernée
    public boolean deplacer(String caseDepart, String caseArrivee){
        //Extraction des données entrées par l'utilisateur
        int ligneDepart = Plateau.lignes.indexOf(caseDepart.charAt(0));
        int colonneDepart = Character.getNumericValue(caseDepart.charAt(1));
        int ligneArrivee = Plateau.lignes.indexOf(caseArrivee.charAt(0));
        int colonneArrivee = Character.getNumericValue(caseArrivee.charAt(1));
        //Création d'une variable de type Deplacement plus simple à manipuler
        Deplacement mouvement = new Deplacement(new Coordonnees(ligneDepart,colonneDepart),new Coordonnees(ligneArrivee,colonneArrivee));
        if(plateau[ligneDepart][colonneDepart].deplacementAutorise(plateau,mouvement)){
            plateau[ligneArrivee][colonneArrivee] = plateau[ligneDepart][colonneDepart];
            plateau[ligneDepart][colonneDepart] = new Piece(false, "  ");
            if(plateau[ligneArrivee][colonneArrivee].promotion(mouvement)) plateau[ligneArrivee][colonneArrivee] = new Reine(plateau[ligneArrivee][colonneArrivee].couleur);
            return true;
        }
        return false;
    }
    //Vérifie si l'un des deux rois est mangé
    public boolean roiMange(){
        int n = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(plateau[i][j].type.equals("Ro")) n++;
            }
        }
        if(n < 2) return true;
        return false;
    }
    //Le camp qui conserve son roi à la fin gagne la partie
    public boolean gagnant(){
        int n = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(plateau[i][j].type.equals("Ro")) return plateau[i][j].couleur;
            }
        }
        return false;
    }
}
