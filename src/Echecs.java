/**
 * Created by francois on 09/05/17.
 */
import java.util.Scanner;
public class Echecs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plateau jeu = new Plateau();
        Affichage.afficher(jeu.plateau);
        String typePiece = "0";
        while(!jeu.pieceExiste(typePiece)){
            System.out.println("Quelle pièce voulez vous déplacer ?");
            typePiece = sc.nextLine();
            if(!jeu.pieceExiste(typePiece)) System.out.println("Cette pièce n'est pas disponible !");
        }
        String deplacement = "0";
        /*
        while(!piece.deplacementPossible()){
            System.out.println("Où cette pièce doit-elle aller ?");
            String str = sc.nextLine();
            if(!piece.type.déplacementPossible()) System.out.println("Ce déplacement est impossible !");
        }
        */
        if (piece.deplacementPossible == true){
            tableau[M][N]=0;
            tableau[P][Q]= typePiece;
        }   
            
    }
}
