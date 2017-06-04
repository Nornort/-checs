/**
 * Created by francois on 15/05/17.
 */
 // affiche le plateau avec des couleurs//
public class Affichage {
    public static void afficher(Piece[][] plateau){
        //Affiche le numéro des colonnes
        for(int i=0;i<8;i++){
            System.out.print(" |" + i);
        }
        System.out.println(" |");
        for(int i=0;i<8;i++){
            //Affiche la lettre des lignes
            System.out.print(Plateau.lignes.charAt(i));
            //Affiche les pièces dans la couleur correspondante
            for(int j=0;j<8;j++){
                System.out.print("|");
                if(!plateau[i][j].couleur) System.out.print(getRouge());
                System.out.print(plateau[i][j].type + getNormal());
            }
            System.out.println("|");
        }
    }
    public static String getRouge(){return "\033[31m";}
    public static String getNormal(){return "\033[0m";}
}
