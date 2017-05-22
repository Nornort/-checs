/**
 * Created by francois on 15/05/17.
 */
public class Affichage {
    public static void afficher(Piece[][] tableau){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print("|");
                if(!tableau[i][j].couleur) System.out.print(getRouge());
                System.out.print(tableau[i][j].type + getNormal());
            }
            System.out.println("|");
        }
        System.out.println("Quelle pièce voulez vous déplacer ?");
    }
    public static String getRouge() {
        return "\033[31m";
    }
    public static String getNormal() {
        return "\033[0m";
    }
}
