/**
 * Created by francois on 15/05/17.
 */
public class Affichage {
    public static void afficher(Piece[][] tableau){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print("|");
                if(tableau[i][j].couleur == false) System.out.print(getRouge());
                switch(tableau[i][j].type){
                    case 0:
                        System.out.print("  ");
                        break;
                    case 1:
                        System.out.print("Pi");
                        break;
                    case 2:
                        System.out.print("To");
                        break;
                    case 3:
                        System.out.print("Ca");
                        break;
                    case 4:
                        System.out.print("Fo");
                        break;
                    case 5:
                        System.out.print("Re");
                        break;
                    case 6:
                        System.out.print("Ro");
                }
                System.out.print(getBlanc());
            }
            System.out.println("|");
        }
        System.out.println("Quelle pièce voulez vous déplacer ?");
    }
    public static String getRouge() {
        return "\033[31m";
    }
    public static String getBlanc() {
        return "\033[0m";
    }
}
